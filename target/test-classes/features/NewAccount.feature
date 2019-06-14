@newaccount
Feature: To test creation of a new account

  Background: 
     Given Login url of the application
    When User enters username as "username"
    And User enters password as "manager_password"
    Then User should be logged in successfully

  @newaccount
  Scenario: Creation of new customer account
    Given Manager is logged in
    When Manager clicks New Account link
    And Manager enters valid "cust_id" in the customer id field
    And Manager chooses a valid account type
    And Manager enters valid initial deposit amount
    And User clicks the submit button
    Then New customer account for "cust_id" should be created successfully
