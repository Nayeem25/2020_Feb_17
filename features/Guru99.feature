Feature: Test Guru99 Demo Site

  Scenario: Test Guru99 Demo Site Login page
	   Given Open Browser and Start Application 
	   When Enter username and password
	   And Click on login button
	   
	   
	   
	   Scenario: Capture the error message when user enters invalid credentials
	   
	   Given Open Browser and Start Application
	   When Enter Username
	   And  Enter Password 
	   And  Click on Login button
	   Then Verify Error message
	   
	   


