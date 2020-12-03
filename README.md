BeneQuick: Aptitude Test 1 :
-----

Scenario :
----------
	A client has provided us with a file that contains basic information about their current membership, 
	and asked us to convert the file and display the content in an web app in a tabular format. The name of the file is 
	"Members.txt" and it's in a fixed-column format. The fields are found to be in the following order and length:
		 id (12)    last name(25)    first name(25)    address(30)    city(20)    state(4)    zip(5) 
		
	They have the following additional feature requirements:

	1) The web app should have a dropdown with list of states that will allow 
	them to view the members on per-state basis. 
	
	2) There should not be duplicate members per state

	A developer started writing an application to accomplish the above requirement but he left the company before he was able to finish. 


Task :
------
	- Study the existing code and implement the remaining logic to have all the functionality requested by customer.

	- Write unit test covering every line of code
Note:
-----
	- The file "Members.txt" is in project folder
	- You may use Internet resources as required.
	- You are not allowed to add any additional class or dependencies except for Unit Test.
    - Don't modify the code if there's a comment stating "Don't modify this file or method"	


How to Run:
----
 This is a maven project with embedded maven wrapper. You don't need to install maven in your PC or even an IDE. 
 You will need internet connection to run this app.  
     
 Steps  
     
    1: Using CLI:
           Go to Project Folder and compile using `ProjectFolder> mvnw clean compile` 
           Run using: `ProjectFolder> mvnw spring-boot:run`
       Using IDE:
           Import the project as Maven project into your IDE and Run `bqtest.BootApplication` class as main class to start the server.
    2: Watch out for the ERROR, fix those and run again.
    3: Open your browser to view the webapp. The port and url can be found on application log
