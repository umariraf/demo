package stepdefinitions;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.LoaderFunction;

public class Deposit extends LoaderFunction {
	Properties homeProperties = locators("src//main//java//locators//homePage.properties");
	Properties depositProperties = locators("src//main//java//locators//depositPage.properties");
	private WebDriver driver;

	CommonStepsInApp steps = new CommonStepsInApp();

	public Deposit() {
		driver = DriverUtils.getDriver();
	}

	@When("^User clicks Deposit link$")
	public void user_clicks_deposit_link() throws Throwable {
		click_element(driver, "linkText", homeProperties.getProperty("deposit_link_loc"));
	}

	@And("^User enters valid deposit amount$")
	public void user_enters_valid_deposit_amount() throws Throwable {
		send_keys(driver, "xpath", depositProperties.getProperty("amount_txt_loc"), "5000");
	}

	@Then("^Amount should be deposited in the given account id$")
	public void check_if_amount_desposited() throws Throwable {
		String accountId = getText(driver, "xpath", depositProperties.getProperty("read_account_id_loc"));
		String depositAmount = getText(driver, "xpath", depositProperties.getProperty("read_deposited_amt_loc"));
		Assert.assertEquals(depositAmount, "5000");
	}
}
