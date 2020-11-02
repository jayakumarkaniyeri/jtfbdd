Feature: Try automating practice page in BDD

  Background: 
    Given Chrome browser is launched
    When User enters url to the practice page and hit enter
    Then User should be navigated to the home page.

  Scenario: 
    When User selects radio1
    And User search for India
    And User selects option1 from drop down
    Then User should be able to select Option2 under checkbox options

  @smoke
  Scenario: 
    When user clicks on open window button
    And new window opens
    And user should be able to select courses
    And user is able to click on open tab button
    Then user plays with alert

  @tableTest
  Scenario: 
    When user presented with tabular data
    Then validate data in it
    