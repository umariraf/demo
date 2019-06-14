package stepdefinitions;

import java.util.Properties;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utils.JsonDataReader;
import utils.LoaderFunction;

public class CommonStepsInApp extends LoaderFunction {
	Properties commonProperties = locators("src//main//java//locators//commonLocators.properties");
	JsonDataReader readObj = new JsonDataReader();

	public CommonStepsInApp() {
		driver = DriverUtils.getDriver();
	}

	@Given("^Manager is logged in$")
	public boolean manager_is_logged_in() {
		boolean is_manager_logged_in = false;
		try {
			is_manager_logged_in = is_displayed(driver, "xpath", commonProperties.getProperty("manager_link_loc"));
		} catch (InterruptedException e) {
			e.getMessage();
		}
		return is_manager_logged_in;
	}

	@Given("^User is logged in$")
	public boolean user_is_logged_in() {
		boolean is_user_logged_in = false;
		try {
			is_user_logged_in = is_displayed(driver, "xpath", commonProperties.getProperty("manager_link_loc"));
		} catch (InterruptedException e) {
			e.getMessage();
		}
		return is_user_logged_in;
	}

	@And("^User enters valid \\\"(.*)\\\" in the Account id field$")
	public void user_enters_valid_account_id(String account_id) throws Throwable {
		send_keys(driver, "xpath", commonProperties.getProperty("accountno_txt_loc"), readObj.retrievevalue(account_id));
	}

	@And("^User enters valid description$")
	public void user_enters_valid_description() throws Throwable {
		send_keys(driver, "xpath", commonProperties.getProperty("description_txt_loc"), "5000 only");
	}

	@When("^User clicks the submit button$")
	public void user_clicks_the_submit_button() throws Throwable {
		click_element(driver, "xpath", commonProperties.getProperty("submit_btn_loc"));

	}

}
