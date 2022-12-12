<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone3</td></tr>
<tr><td> <em>Student: </em> Haider Mohammad (hhm7)</td></tr>
<tr><td> <em>Generated: </em> 12/12/2022 00:47:09</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-007-F22/it114-chatroom-milestone3/grade/hhm7" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Connection Screens </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the screens with the following data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/206958832-56e1a9d7-f1dd-4409-a5f2-0c564af3f271.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Host and port screen<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/206959039-2019a2bf-88c8-4673-bbb0-56d1a7f3b998.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Username screen<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the code for each step of the process</td></tr>
<tr><td> <em>Response:</em> <p>Using the GUI in Java, I generated panels using JPanel class and created<br>one panel for the host and port screen and one for the username.<br>I attached an actionListener to the next button in the host and port<br>screen which goes to the next panel which is the username screen panel.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Chatroom view </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/206960939-41af889a-2b71-489c-8126-744f60351a15.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Checklist 1,2,3<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/206961239-a2baf3b3-472e-4224-a61e-a0e5699e6bc1.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>snippet for the code that lets the enter key send the message<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Chat Activities </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show screenshots of the result of the following commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/206961471-8fbb1f28-6ce8-4bc3-8817-539b865d843c.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>show /roll<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/206961576-a77a2b9c-499f-44ca-a26d-e5b5bcdb099b.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>show /flip<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the code snippets for each command</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/206962169-9f730f24-b148-4a6c-9e2f-fdfb2ae7892d.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>checklist 1,2,3,4<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code flow of each command</td></tr>
<tr><td> <em>Response:</em> <p>command roll:<div>when the user sends the /roll command, it executes the code in<br>the roll case in the function that processes command. I generated a random<br>integer using the Random[] method in Java which returns a random number.</div><div><br></div><div>command flip:<div>when<br>the user sends the /flip command, it executes the code in the roll<br>case in the function that processes command. I generated a random integer using<br>the Random[] method in Java which returns a random number between 1 and<br>2. If the number returned is 0, the function returns the first element<br>in coin array which is heads and tails if the number returned is<br>1.</div></div><div><br></div><div>3. The client sends the command to the server and is processed by<br>the processed commands function which checks if a command was sent from the<br>client.</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Custom Text </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Screenshots of examples</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/206964516-636ead84-919d-4603-a19c-3fdcaff54ddd.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>1,2,3,4,5,6,7<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how you got the UI side to render the text accordingly</td></tr>
<tr><td> <em>Response:</em> <p>depending on the command, the server side adds the html tags for the<br>styling. The user doesn&#39;t have to type html tags. The user just needs<br>to add the character in the beginning of the message so the code<br>can&#39;t add html tags depending on the character in the beginning of the<br>message. For example, to change the styling to bold, the first character in<br>the message should be ^.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 5: </em> Whisper </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing a demo of whisper commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/206965753-6162d889-1fe1-464b-934a-5fbc5d527750.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>@username command<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the server-side code snippets of how this feature works</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/206965753-6162d889-1fe1-464b-934a-5fbc5d527750.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>1,2<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <p>The server has an array list which keeps track of all the users<br>in the room at a given moment, when the user sends the @username<br>command, the sendPrivateMessage&nbsp; function goes through the list of users in the room<br>and sends the message to the user targeted.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 6: </em> Mute/Unmute </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots demoing this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/206967016-84d3e1fa-bd69-4529-ac33-f9a675b4dde9.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>/mute command<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshots of the code snippets that achieve this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/206967402-d907a873-8470-4e9f-ab44-ffe87744e44c.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>code for the muted list<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <p>Once the user mutes another user, the server saves that muted user in<br>a text file. From that point on, the server loads the list of<br>muted users and sends the message only to those users not in the<br>muted list. The server does this using methods for saving and loading muted<br>users before sending the message to everyone in that room.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 7: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Pull request from milestone3 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/HaiderMohammad/IT114-007/pull/5">https://github.com/HaiderMohammad/IT114-007/pull/5</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-007-F22/it114-chatroom-milestone3/grade/hhm7" target="_blank">Grading</a></td></tr></table>