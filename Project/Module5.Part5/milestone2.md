<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone 2</td></tr>
<tr><td> <em>Student: </em> Haider Mohammad (hhm7)</td></tr>
<tr><td> <em>Generated: </em> 06/12/2022 01:14:55</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-007-F22/it114-chatroom-milestone-2/grade/hhm7" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone2 from the proposal document:&nbsp; <a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Payload </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Payload Screenshots</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/205820012-d01dcde6-1c2a-47f5-8cf9-3aae5e65cad4.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>payload code<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/205820675-958b59a6-d8bc-4c27-ade3-c3f65973120f.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>payload content<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Server-side commands </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the mentioned commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/205821611-b2bdea3f-997e-4e36-8dfa-37046ff5bd94.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>/roll code<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/205821611-b2bdea3f-997e-4e36-8dfa-37046ff5bd94.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>/flip code<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Explain the logic/implementation of each commands</td></tr>
<tr><td> <em>Response:</em> <ol><br><li>using the random method in java, I generated a random number anywhere<br>between 0 to 10.&nbsp;<div>2. I created an array containing heads and tails and<br>using the rnd method generated a number between 0 and 1 and returned<br>that index.&nbsp;</div><br></li><br></ol><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Text Display </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the various style handling</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/205827152-fd56828d-9fe9-4fa0-98ad-7827f4b9c003.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>bold, italics, underline styling<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/205827673-f4b14f11-f39f-4d8d-861e-89c889dc5718.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>color styling<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show source message and the result output in the terminal (note, you won't actually see the styles until Milestone3)</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/205832637-fd9ac812-e001-4107-b5e1-c847f368e983.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>italics display<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/205833095-2dbc4ee4-a016-4e54-8daf-bae22d13ae88.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>bold display<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/205833595-fba1e0ac-21b9-4f15-ab3d-c3db66cf0fd1.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>underline display<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/113857654/205834355-f66542a1-d18c-497a-a8fd-f18ba8fa62ba.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>color display<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Explain how you got each style applied</td></tr>
<tr><td> <em>Response:</em> <ol><br><li>To change styling to bold, if the first and last character in<br>your message is &quot;^&quot;, then html tags for bold will be added to<br>the message.&nbsp;<div>2. To change styling to italics, if the first and last character<br>in your message is &quot;*&quot;, then html tags for italics will be added<br>to the message.</div><div>3. To change the styling for color, if the command &quot;/color<br>[specify the color here]&nbsp; is called then the color tags for the specified<br>color will be added to the message.</div><div>4. To change styling to underline, if<br>the first and last character in your message is &quot;_&quot;, then html tags<br>for underline will be added to the message.</div><br></li><br></ol><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Include the pull request for Milestone2 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/HaiderMohammad/IT114-007/pull/4">https://github.com/HaiderMohammad/IT114-007/pull/4</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-007-F22/it114-chatroom-milestone-2/grade/hhm7" target="_blank">Grading</a></td></tr></table>