Feature: Auth feature
   
   
   Scenario: User Register - Fill Nama Lengkap, Email, Password
   	Given User navigates to login page
   	When User click register button
   	And user navigate to register page
   	And user enter nama lengkap, email, and password
   	And user click register button 
   	Then user navigate to login page
