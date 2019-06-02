@login
Feature: To test login functionality of banking application

  Scenario: Test Login function of a Banking application
    Given Login url of the application
    When User enters a valid username
    And User enters a valid password
    Then User should be logged in successfully
