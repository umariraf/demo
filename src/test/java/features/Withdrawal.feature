@withdrawal
Feature: To test withdrawal workflow in an account

  Background: 
    Given Login url of the application
    When User enters a valid username
    And User enters a valid password
    Then User should be logged in successfully

  Scenario: Withdraw amount from an active account
    Given User is logged in
    When User clicks Withdrawal link
    And User enters valid Account id in the Account id field
    And User enters valid withdrawal amount
    And User enters valid description
    And User clicks the submit button
    Then Amount should be withdrawn from the given account id
