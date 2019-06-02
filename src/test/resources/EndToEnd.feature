@login
Feature: To test end to end functionality of banking application

  Scenario: Test Login function of a Banking application
    Given Login url of the application
    When User enters a valid username
    And User enters a valid password
    Then User should be logged in successfully

  @newcustomer
  Scenario: Creation of new customer record
    Given Manager is logged in successfully
    When Manager clicks New Customer link
    And Manager enters values in the given fields
    And User clicks the submit button
    Then New customer record should be created successfully

  @newaccount
  Scenario: Creation of new customer account
    Given Manager is logged in
    When Manager clicks New Account link
    And Manager enters valid customer id in the customer id field
    And Manager chooses a valid account type
    And Manager enters valid initial deposit amount
    And User clicks the submit button
    Then New customer account should be created successfully

  @deposit
  Scenario: Deposit amount in an active account
    Given User is logged in
    When User clicks Deposit link
    And User enters valid Account id in the Account id field
    And User enters valid deposit amount
    And User enters valid description
    And User clicks the submit button
    Then Amount should be deposited in the given account id

  @withdrawal
  Scenario: Withdraw amount from an active account
    Given User is logged in
    When User clicks Withdrawal link
    And User enters valid Account id in the Account id field
    And User enters valid withdrawal amount
    And User enters valid description
    And User clicks the submit button
    Then Amount should be withdrawn from the given account id

  @balanceenquiry
  Scenario: Balance enquiry in an active account
    Given User is logged in
    When User clicks Balance Enquiry link
    And User enters valid Account id in the Account id field
    And User clicks the submit button
    Then Balance amount in the given account id should be displayed

  @deleteaccount
  Scenario: Delete an active account
    Given Manager is logged in
    When Manager clicks Delete Account link
    And Manager enters valid Account id in the Account id field
    And User clicks the submit button
    Then Account should be deleted succesfully
