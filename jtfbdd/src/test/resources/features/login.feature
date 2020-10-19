Feature: Test the login functionality

Scenario: User login with valid credentials

Given user is on login page
When user enter userame and password
And press login button
Then user should be able to login successfully