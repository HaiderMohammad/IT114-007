<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone4</td></tr>
<tr><td> <em>Student: </em> Haider Mohammad (hhm7)</td></tr>
<tr><td> <em>Generated: </em> 21/12/2022 22:33:54</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-007-F22/it114-chatroom-milestone4/grade/hhm7" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Client can export chat history of their current session (client-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot of related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/209045235-ad315823-82c2-44c4-8456-6125a4d47e49.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>export chat button<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot of exported data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/209045653-544fa83e-9913-4078-bee9-c62b5922a139.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Chat log plus styling examples<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>Each time a message is sent or received, the UI adds a text<br>area component which displays the text sent by the users. It has functions<br>for receiving and sending messages that update the text in each text area.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Client's mute list will persist across sessions (server-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot of how the mute list is stored</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/209046273-94141d21-2564-4286-8559-e8fd527da741.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>persisting mute list<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the code saving/loading mute list</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/209046866-8d9c4b97-5273-4761-a437-5bc1ac7eed17.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>saving mute logic<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>The function that saves a new user to the mute list, it opens<br>a file to write to using FileWriter and adds the new muted user.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Client's will receive a message when they get muted/unmuted by another user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot showing the related chat messages</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/209047355-851ab76e-6e80-46c0-b586-10c4cfb49848.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>muted user message<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the related code snippets</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/209047693-a3fdc517-94b2-48ca-97bf-b0b6adeb8788.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>code for muted users&#39; message<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>Once the mute command is called, the server adds the muted user in<br>a list, then it saves the muted users list into a text file<br>that persists across sessions.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> User list should update per the status of each user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot for Muted users by the client should appear grayed out</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/209048586-13b7a361-3b80-469a-8506-d252e5d002d4.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Grayed out user list<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot for Last person to send a message gets highlighted</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/209048586-13b7a361-3b80-469a-8506-d252e5d002d4.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Highlighted last message<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>When a new message is received, the UI updates in real time which<br>highlights the latest message.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-007-F22/it114-chatroom-milestone4/grade/hhm7" target="_blank">Grading</a></td></tr></table>