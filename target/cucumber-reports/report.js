$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/EndToEnd.feature");
formatter.feature({
  "name": "To test end to end functionality of banking application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Test Login function of a Banking application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Login url of the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPage.login_url_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username as \"username\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.user_enters_a_valid_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password as \"manager_password\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_enters_a_valid_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_should_be_logged_in_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creation of new customer record",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@newcustomer"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Manager is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonStepsInApp.manager_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Manager clicks New Customer link",
  "keyword": "When "
});
formatter.match({
  "location": "NewCustomer.manager_clicks_new_customer_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Manager enters values in the given fields",
  "keyword": "And "
});
formatter.match({
  "location": "NewCustomer.manager_enters_values_in_the_given_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "CommonStepsInApp.user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "New customer record should be created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "NewCustomer.new_customer_record_should_be_created_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creation of new customer account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@newaccount"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Manager is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonStepsInApp.manager_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Manager clicks New Account link",
  "keyword": "When "
});
formatter.match({
  "location": "NewAccount.manager_clicks_new_account_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Manager enters valid \"cust_id\" in the customer id field",
  "keyword": "And "
});
formatter.match({
  "location": "NewAccount.manager_enters_valid_customer_id(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Manager chooses a valid account type",
  "keyword": "And "
});
formatter.match({
  "location": "NewAccount.manager_chooses_a_valid_account_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Manager enters valid initial deposit amount",
  "keyword": "And "
});
formatter.match({
  "location": "NewAccount.manager_enters_valid_initial_deposit_amount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "CommonStepsInApp.user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "New customer account for \"cust_id\" should be created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "NewAccount.new_customer_account_should_be_created_successfully(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deposit amount in an active account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@deposit"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonStepsInApp.user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Deposit link",
  "keyword": "When "
});
formatter.match({
  "location": "Deposit.user_clicks_deposit_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid \"account_id\" in the Account id field",
  "keyword": "And "
});
formatter.match({
  "location": "CommonStepsInApp.user_enters_valid_account_id(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid deposit amount",
  "keyword": "And "
});
formatter.match({
  "location": "Deposit.user_enters_valid_deposit_amount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid description",
  "keyword": "And "
});
formatter.match({
  "location": "CommonStepsInApp.user_enters_valid_description()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "CommonStepsInApp.user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Amount should be deposited in the given account id",
  "keyword": "Then "
});
formatter.match({
  "location": "Deposit.check_if_amount_desposited()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Withdraw amount from an active account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@withdrawal"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonStepsInApp.user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Withdrawal link",
  "keyword": "When "
});
formatter.match({
  "location": "Withdrawal.user_clicks_withdrawal_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid \"account_id\" in the Account id field",
  "keyword": "And "
});
formatter.match({
  "location": "CommonStepsInApp.user_enters_valid_account_id(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid withdrawal amount",
  "keyword": "And "
});
formatter.match({
  "location": "Withdrawal.user_enters_withdrawal_amount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid description",
  "keyword": "And "
});
formatter.match({
  "location": "CommonStepsInApp.user_enters_valid_description()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "CommonStepsInApp.user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Amount should be withdrawn from the given account id",
  "keyword": "Then "
});
formatter.match({
  "location": "Withdrawal.check_if_amount_is_withdrawn()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Balance enquiry in an active account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@balanceenquiry"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonStepsInApp.user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Balance Enquiry link",
  "keyword": "When "
});
formatter.match({
  "location": "BalanceEnquiry.user_clicks_balance_enquiry_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid \"account_id\" in the Account id field",
  "keyword": "And "
});
formatter.match({
  "location": "CommonStepsInApp.user_enters_valid_account_id(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "CommonStepsInApp.user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Balance amount in the given account id should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BalanceEnquiry.check_if_balance_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete an active account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@deleteaccount"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Manager is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonStepsInApp.manager_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Manager clicks Delete Account link",
  "keyword": "When "
});
formatter.match({
  "location": "DeleteAccount.manager_clicks_deposit_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Manager enters valid \"account_id\" in the Account id field",
  "keyword": "And "
});
formatter.match({
  "location": "DeleteAccount.manager_enters_valid_account_id(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "CommonStepsInApp.user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Manager accepts the alert",
  "keyword": "And "
});
formatter.match({
  "location": "DeleteAccount.accept_alert()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"account_id\" should be deleted succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteAccount.check_if_account_deleted(String)"
});
formatter.result({
  "status": "passed"
});
});