package Module5.Part5;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Random;

/**
 * A server-side representation of a single client
 */
public class ServerThread extends Thread {
    private Socket client;
    private String clientName;
    private boolean isRunning = false;
    private ObjectOutputStream out;// exposed here for send()
    // private Server server;// ref to our server so we can call methods on it
    // more easily
    private Room currentRoom;
	private final static String COMMAND_TRIGGER = "/";
	private final static String ROLL = "roll";
	private final static String FLIP = "flip";
	private final static String COLOR = "color";
	private final static String JOIN_ROOM = "joinroom";
	
    private void info(String message) {
        System.out.println(String.format("Thread[%s]: %s", getId(), message));
    }

    public ServerThread(Socket myClient, Room room) {
        info("Thread created");
        // get communication channels to single client
        this.client = myClient;
        this.currentRoom = room;

    }

    protected void setClientName(String name) {
        if (name == null || name.isBlank()) {
            System.err.println("Invalid client name being set");
            return;
        }
        clientName = name;
    }

    protected String getClientName() {
        return clientName;
    }

    protected synchronized Room getCurrentRoom() {
        return currentRoom;
    }

    protected synchronized void setCurrentRoom(Room room) {
        if (room != null) {
            currentRoom = room;
        } else {
            info("Passed in room was null, this shouldn't happen");
        }
    }

    public void disconnect() {
        info("Thread being disconnected by server");
        isRunning = false;
        cleanup();
    }

    // send methods
    public boolean sendMessage(String from, String message) {
        Payload p = new Payload();
        p.setPayloadType(PayloadType.MESSAGE);
        p.setClientName(from);
        p.setMessage(message);
        return send(p);
    }
    public boolean sendConnectionStatus(String who, boolean isConnected){
        Payload p = new Payload();
        p.setPayloadType(isConnected?PayloadType.CONNECT:PayloadType.DISCONNECT);
        p.setClientName(who);
        p.setMessage(isConnected?"connected":"disconnected");
        return send(p);
    }

    private boolean send(Payload payload) {
        // added a boolean so we can see if the send was successful
        try {
            out.writeObject(payload);
            return true;
        } catch (IOException e) {
            info("Error sending message to client (most likely disconnected)");
            // comment this out to inspect the stack trace
            // e.printStackTrace();
            cleanup();
            return false;
        } catch (NullPointerException ne) {
            info("Message was attempted to be sent before outbound stream was opened");
            return true;// true since it's likely pending being opened
        }
	}

    // end send methods
    @Override
    public void run() {
        info("Thread starting");
        try (ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(client.getInputStream());) {
            this.out = out;
            isRunning = true;
            Payload fromClient;
            while (isRunning && // flag to let us easily control the loop
                    (fromClient = (Payload) in.readObject()) != null // reads an object from inputStream (null would
                                                                     // likely mean a disconnect)
            ) {

                info("Received from client: " + fromClient);
                processMessage(fromClient);

            } // close while loop
        } catch (Exception e) {
            // happens when client disconnects
            e.printStackTrace();
            info("Client disconnected");
        } finally {
            isRunning = false;
            info("Exited thread loop. Cleaning up connection");
            cleanup();
        }
    }

    void processMessage(Payload p) {
        switch (p.getPayloadType()) {
            case CONNECT:
                setClientName(p.getClientName());
                break;
            case DISCONNECT://TBD
                break;
            case MESSAGE:
                if (currentRoom != null) { 
                	String r = "";
            		String m = p.getMessage();
            		
            		if(m.charAt(0) == '*' && m.charAt((m.length())-1) == '*') {
            			r = m.substring(1, m.length() - 1);
            			r = "</i>"+r+"</i>";
            		}
            		else if(m.charAt(0) == '^' && m.charAt((m.length())-1) == '^') {
            		r = m.substring(1, m.length() - 1);
            		r = "</b>"+r+"</b>";
            		}
            		else if(m.charAt(0) == '_' && m.charAt((m.length())-1) == '_') {
            		r = m.substring(1, m.length() - 1);
            		r = "</u>"+r+"</u>";
            		}else if (m.contains(COMMAND_TRIGGER)) {
        				String[] comm = m.split("/");
        				String[] comm2 = comm[1].split(" "); 
						String command = comm2[0];
        				if (command != null) {
        					command = command.toLowerCase();
        				}
        				switch (command) {
        				case ROLL:
        						int ran = new Random().nextInt(10);
        						r = String.valueOf(ran);						// wasCommand = true;
        						break;
    					case FLIP:
    						String[] coin = { "Heads", "Tails" };
    						int rnd = new Random().nextInt(2);
    						r = coin[rnd];
    						// wasCommand = true;
    						break;
						
						  case COLOR: 
//							  String[] comm2 = comm[1].split(" "); 
//							  String command2 = comm2[0];
							  String color = comm2[1];
							  String message = comm2[2];
						  r = "<span style=\"color: " + color + ";\">" + message + "</span>"; 
						  //wasCommand = true; 
						  break;
						 
        				}
        			}else {
            			r = m;
            		}            	
                    currentRoom.sendMessage(this, currentRoom.getName() + ": "  + r);
                    
                } else {
                    // TODO migrate to lobby
                    Room.joinRoom("lobby", this);
                }
                break;
			
			  case CREATE_ROOM: Room.createRoom(p.getMessage(), this); 
			  	break; 
			  case
			  	JOIN_ROOM: Room.joinRoom(p.getMessage(), this); break;
			 
            default:
                break;

        }

    }

    private void cleanup() {
        info("Thread cleanup() start");
        try {
            client.close();
        } catch (IOException e) {
            info("Client already closed");
        }
        info("Thread cleanup() complete");
    }

}