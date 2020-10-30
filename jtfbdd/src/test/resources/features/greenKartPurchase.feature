Feature: To test the online purchase functionality from GreenKart

  Background: 
    Given Browser is open
    When User provide URL
    Then User should be navigated to the home page

  Scenario: 
    When User adds multiple veg to cart
    And Proceed to checkout and click place order
    And Select country and agree to TnC
    And Click proceed
    Then Order should be successfully placed
