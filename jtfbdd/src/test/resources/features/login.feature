Feature: Test the login functionality

  Scenario Outline: User login with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And press login button
    Then user should be able to login successfully

    Examples: 
      | username | password |
      | jay      |    12345 |
      | aishu    |    12345 |
