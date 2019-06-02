@deleteaccount
Feature: To test account deletion workflow in an account

  Background: 
    Given Login url of the application
    When User enters a valid username
    And User enters a valid password
    Then User should be logged in successfully

  Scenario: Delete an active account
    Given Manager is logged in
    When Manager clicks Delete Account link
    And Manager enters valid Account id in the Account id field
    And User clicks the submit button
    Then Account should be deleted succesfully
