Feature: complete the assignment given in udemy course

  Background: 
    Given Chrome browser is open
    When User provides site address
    Then Webpage should be loaded

  @Assignment
  Scenario: 
    When User is on flight search page
    And User provides journey details and click search
    Then Available flight should be listed
