@logout
Feature: To test logout functionality of banking application

 Background: 
    Given Login url of the application
    When User enters a valid username
    And User enters a valid password
    Then User should be logged in successfully
    
  Scenario: Test Logout function of a Banking application
    Given User is successfully logged in and the session is active
    Then User clicks the logout button and is logged out successfully
