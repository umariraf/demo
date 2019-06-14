@login
Feature: To test login functionality of banking application

  Scenario: Test Login function of a Banking application
    Given Login url of the application
    When User enters username as "username"
    And User enters password as "password"
    Then User should be logged in successfully
