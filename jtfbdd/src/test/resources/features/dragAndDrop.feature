Feature: complete the assignment given in udemy course

  Background: 
    Given Chrome browser is started
    When User provides site url
    Then Webpage should be displayed

  @actionTest
  Scenario: 
    When User is on home page
    And User click and hold the object
    Then User should be able to drag and drop
