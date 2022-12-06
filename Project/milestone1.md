<table><tr><td> <em>Assignment: </em> It114 Milestone1</td></tr>
<tr><td> <em>Student: </em> Haider Mohammad (hhm7)</td></tr>
<tr><td> <em>Generated: </em> 30/11/2022 23:57:23</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-007-F22/it114-milestone1/grade/hhm7" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create a new branch called Milestone1</li><li>At the root of your repository create a folder called Project</li><li>Create a milestone1.md file inside the project folder</li><li>Git add/commit/push it to Github</li><li>Create a pull request from Milestone1 to main (don't complete/merge it yet)</li><li>Copy in the latest Socket sample code from the most recent Socket Part example of the lessons</li><ol><li>Recommended Part 5, but Part 4 should be sufficient</li><li><a href="https://github.com/MattToegel/IT114/tree/Module5/Module5">https://github.com/MattToegel/IT114/tree/Module5/Module5</a>&nbsp;<br></li></ol><li>Git add/commit the baseline</li><li>Ensure the sample is working and fill in the below deliverables</li><li>Get the markdown content or the file and paste it into the milestone1.md file or replace the file with the downloaded version</li><li>Git add/commit/push all changes</li><li>Complete the pull request merge from step 5</li><li>Locally checkout main</li><li>git pull origin main</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Startup </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot showing your server being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/204954773-30a3ff0d-c432-420a-8a4e-e1c3534c5c62.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>server running<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot showing your client being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/204963432-575f675c-0603-469e-9c95-64e20dd33f87.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Client running and waiting for input<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the connection process</td></tr>
<tr><td> <em>Response:</em> <p>The server side receives requests from the client and processes them. The server<br>side of the connection runs on a certain port number which the client<br>side connects to.<div>The client side takes user input and sends requests to the<br>server to process. The client needs the IP address and the port number<br>of the machine server is running on.&nbsp;</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Sending/Receiving </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/204963629-3eb40475-45f3-4e9d-8b1a-be1cf07535ea.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Multiple clients connected to the server<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/204963925-c670698c-2458-437e-ab46-af28b53a9737.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>sending message to the server (applies to #2,#3,#4)<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the messages are sent, broadcasted, and received</td></tr>
<tr><td> <em>Response:</em> <p>1.&nbsp;<span style="font-family: Nunito, sans-serif; font-size: 16px; text-align: justify;">The DataOutputStream (which is part of<br>the client class) is used to write data to the server.</span><div><div style="text-align: justify;">&lt;font<br>face=&quot;Nunito, sans-serif&quot;&gt;<span style="font-size: 16px;">2. Each time a new client connects to the server,<br>a new server thread is started and the messages are sent and received<br>by that thread.</span></font></div><div style="text-align: justify;"><font face="Nunito, sans-serif"><span style="font-size: 16px;">3. Once a client joins<br>a room, the messages are received by the server threads within that room.&nbsp;</span></font></div><div>&lt;span<br>style=&quot;font-family: Nunito, sans-serif; font-size: 16px; text-align: justify;&quot;&gt;4. The DataInputStream (which is part of<br>the client class) is used to read data being received from the client.</span><div><br></div></div></div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Disconnecting / Terminating </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist on the right</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/204966310-de5b1e1f-b186-4c57-a6bc-5940c7bede1b.png"/></td></tr>
<tr><td> <em>Caption:</em> <p> Client disconnecting from the server,  client disconnect messages shown.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/204966559-4fc688af-75f2-48f0-8dde-3da6ac7e36d7.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Server terminated but client still running, disconnect messages shown.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the various disconnects/terminations are handled</td></tr>
<tr><td> <em>Response:</em> <ol><br><li>Since the client connects to a server that&#39;s already running on a<br>specific port the client disconnecting doesn&#39;t affect it. The socket&#39;s library has methods<br>like close() to handle disconnecting from a server.&nbsp;<div>2. The client doesn&#39;t know the<br>server has terminated until it tries to send data to the server.&nbsp;</div><div>3. As<br>long as the server is running, clients can connect and disconnect from it<br>at their convenience. The server is running on a specific port that the<br>client doesn&#39;t directly interact with.</div><br></li><br></ol><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add the pull request for this branch</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/HaiderMohammad/IT114-007/pull/3">https://github.com/HaiderMohammad/IT114-007/pull/3</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-007-F22/it114-milestone1/grade/hhm7" target="_blank">Grading</a></td></tr></table>