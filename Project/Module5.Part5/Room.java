package Module5.Part5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Room implements AutoCloseable{
	protected static Server server;// used to refer to accessible server functions
	private String name;
	private List<ServerThread> clients = new ArrayList<ServerThread>();
	private boolean isRunning = false;
	// Commands
	private final static String COMMAND_TRIGGER = "/";
	private final static String CREATE_ROOM = "createroom";
	private final static String JOIN_ROOM = "joinroom";
	/*
	 * private final static String DISCONNECT = "disconnect"; private final static
	 * String LOGOUT = "logout"; private final static String LOGOFF = "logoff";
	 * private final static String ROLL = "roll"; private final static String FLIP =
	 * "flip"; private static final String COLOR = null;
	 */

	public Room(String name) {
		this.name = name;
		isRunning = true;
	}

	private void info(String message) {
		System.out.println(String.format("Room[%s]: %s", name, message));
	}

	public String getName() {
		return name;
	}

	protected synchronized void addClient(ServerThread client) {
		if (!isRunning) {
			return;
		}
		client.setCurrentRoom(this);
		if (clients.indexOf(client) > -1) {
			info("Attempting to add a client that already exists");
		} else {
			clients.add(client);
			new Thread() {
				@Override
				public void run() {
					// slight delay to let potentially new client to finish
					// binding input/output streams
					// comment out the Thread.sleep to see what happens
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//sendMessage(client, "joined the room " + getName());
					sendConnectionStatus(client, true);
				}
			}.start();

		}
	}

	protected synchronized void removeClient(ServerThread client) {
		if (!isRunning) {
			return;
		}
		clients.remove(client);
		// we don't need to broadcast it to the server
		// only to our own Room
		if (clients.size() > 0) {
			//sendMessage(client, "left the room");
			sendConnectionStatus(client, false);
		}
		checkClients();
	}

	/***
	 * Checks the number of clients.
	 * If zero, begins the cleanup process to dispose of the room
	 */
	private void checkClients() {
		// Cleanup if room is empty and not lobby
		if (!name.equalsIgnoreCase("lobby") && clients.size() == 0) {
			close();
		}
	}
	
	private String textEffects(String message) {
		// Bold
		if (message.contains("**")) {
			message = message.replaceAll("\\*\\*\\b", "<b>").replaceAll("\\b\\*\\*", "</b>");
		}
		// Italics
		if (message.contains("*")) {
			message = message.replaceAll("\\*\\b", "<i>").replaceAll("\\b\\*", "</i>");
		}
		// Underline
		if (message.contains("__")) {
			message = message.replaceAll("\\b__", "<u>").replaceAll("__\\b", "</u>");
		}
		return message;
	}

	/***
	 * Helper function to process messages to trigger different functionality.
	 * 
	 * @param message The original message being sent
	 * @param client  The sender of the message (since they'll be the ones
	 *                triggering the actions)
	 */
	private String processCommands(String message, ServerThread client) {
		// boolean wasCommand = false;
		String response = null;
		Random generator = new Random();
		try {
			if (message.indexOf(COMMAND_TRIGGER) > -1) {
				String[] comm = message.split(COMMAND_TRIGGER);
				String part1 = comm[1];
				String[] comm2 = part1.split(" ");
				String command = comm2[0];
				if (command != null) {
					command = command.toLowerCase();
				}
				String roomName;
				switch (command) {
					case CREATE_ROOM:
						roomName = comm2[1];
						if (server.createNewRoom(roomName)) {
							joinRoom(roomName, client);
						}
						// wasCommand = true;
						break;
					case JOIN_ROOM:
						roomName = comm2[1];
						joinRoom(roomName, client);
						// wasCommand = true;
						break;			
					
					default:
						response = textEffects(message);
						break;
				}
			} else {
				response = textEffects(message);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// return wasCommand;
		return response;
	}

	// Command helper methods
	protected static void createRoom(String roomName, ServerThread client) {
		if (server.createNewRoom(roomName)) {
			//server.joinRoom(roomName, client);
			Room.joinRoom(roomName, client);
		} else {
			client.sendMessage("Server", String.format("Room %s already exists", roomName));
		}
	}

	protected static void joinRoom(String roomName, ServerThread client) {
		if (!server.joinRoom(roomName, client)) {
			client.sendMessage("Server", String.format("Room %s doesn't exist", roomName));
		}
	}
	
	protected static void disconnectClient(ServerThread client, Room room) {
		client.setCurrentRoom(null);
		client.disconnect();
		room.removeClient(client);
	}
	// end command helper methods

	/***
	 * Takes a sender and a message and broadcasts the message to all clients in
	 * this room. Client is mostly passed for command purposes but we can also use
	 * it to extract other client info.
	 * 
	 * @param sender  The client sending the message
	 * @param message The message to broadcast inside the room
	 */
	/*
	 * protected void sendMessage(ServerThread sender, String message) {
	 * info(": Sending message to " + clients.size() + " clients"); String response
	 * = processCommands(message, sender); if (response == null) { // it was a
	 * command, don't broadcast return; } message = response; Iterator<ServerThread>
	 * iter = clients.iterator(); while (iter.hasNext()) { ServerThread client =
	 * iter.next(); boolean messageSent = client.send(sender.getClientName(),
	 * message); if (!messageSent) { iter.remove(); info("Removed client " +
	 * client.getId()); }
	 * 
	 * } }
	 */
	protected synchronized void sendMessage(ServerThread sender, String message) {
		if (!isRunning) {
			return;
		}
		info("Sending message to " + clients.size() + " clients");
		/*
		 * if (sender != null) && processCommands(message, sender)) { // it was a
		 * command, don't broadcast return; }
		 */
		String from = (sender == null ? "Room" : sender.getClientName());
		Iterator<ServerThread> iter = clients.iterator();
		while (iter.hasNext()) {
			ServerThread client = iter.next();
			boolean messageSent = client.sendMessage(from, message);
			if (!messageSent) {
				handleDisconnect(iter, client);
			}
		}
	}
	protected synchronized void sendConnectionStatus(ServerThread sender, boolean isConnected){
		Iterator<ServerThread> iter = clients.iterator();
		while (iter.hasNext()) {
			ServerThread client = iter.next();
			boolean messageSent = client.sendConnectionStatus(sender.getClientName(), isConnected);
			if (!messageSent) {
				handleDisconnect(iter, client);
			}
		}
	}
	private void handleDisconnect(Iterator<ServerThread> iter, ServerThread client){
		iter.remove();
		info("Removed client " + client.getClientName());
		checkClients();
		sendMessage(null, client.getClientName() + " disconnected");
	}
	public void close() {
		server.removeRoom(this);
		server = null;
		isRunning = false;
		clients = null;
	}
}