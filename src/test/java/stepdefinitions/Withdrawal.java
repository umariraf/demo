package stepdefinitions;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.LoaderFunction;

public class Withdrawal extends LoaderFunction {
	Properties homeProperties = locators("src//main//java//locators//homePage.properties");
	Properties withdrawalProperties = locators("src//main//java//locators//withdrawalPage.properties");
	private WebDriver driver;

	CommonStepsInApp steps = new CommonStepsInApp();

	public Withdrawal() {
		driver = DriverUtils.getDriver();
	}

	@When("^User clicks Withdrawal link$")
	public void user_clicks_withdrawal_link() throws Throwable {
		click_element(driver, "linkText", homeProperties.getProperty("withdrawal_link_loc"));
	}

	@And("^User enters valid withdrawal amount$")
	public void user_enters_withdrawal_amount() throws Throwable {
		send_keys(driver, "xpath", withdrawalProperties.getProperty("amount_txt_loc"), "5000");
	}

	@Then("^Amount should be withdrawn from the given account id$")
	public void check_if_amount_is_withdrawn() throws Throwable {
		String accountId = getText(driver, "xpath", withdrawalProperties.getProperty("read_account_id_loc"));
		String withdrawnAmount = getText(driver, "xpath", withdrawalProperties.getProperty("read_withdrawn_amt_loc"));
		Assert.assertEquals(withdrawnAmount, "5000");
	}
}
