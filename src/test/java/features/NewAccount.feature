@newaccount
Feature: To test creation of a new account

  Background: 
    Given Login url of the application
    When User enters a valid username
    And User enters a valid password
    Then User should be logged in successfully

  Scenario: Creation of new customer account
    Given Manager is logged in
    When Manager clicks New Account link
    And Manager enters valid customer id in the customer id field
    And Manager chooses a valid account type
    And Manager enters valid initial deposit amount
    And User clicks the submit button
    Then New customer account should be created successfully
