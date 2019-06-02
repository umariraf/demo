@balanceenquiry
Feature: To test balance enquiry workflow in an account

  Background: 
    Given Login url of the application
    When User enters a valid username
    And User enters a valid password
    Then User should be logged in successfully

  Scenario: Balance enquiry in an active account
    Given User is logged in
    When User clicks Balance Enquiry link
    And User enters valid Account id in the Account id field
    And User clicks the submit button
    Then Balance amount in the given account id should be displayed
