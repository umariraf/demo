@newcustomer
Feature: To test adding a new customer

  Background: 
    Given Login url of the application
    When User enters a valid username
    And User enters a valid password
    Then User should be logged in successfully

  Scenario: Creation of new customer record
  	Given Manager is logged in successfully
    When Manager clicks New Customer link
    And Manager enters values in the given fields
    And User clicks the submit button
    Then New customer record should be created successfully
