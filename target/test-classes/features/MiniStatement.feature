@MiniStatement
Feature: To test mini statement workflow in an account

  Background: 
    Given Login url of the application
    When User enters a valid username
    And User enters a valid password
    Then User should be logged in successfully

  Scenario: Mini Statement of an active account
    When Manager clicks Mini Statement link
    And Manager enters valid Account id in the Account id field
    And Manager clicks the submit button
    Then Mini Statement the given account id should be displayed
