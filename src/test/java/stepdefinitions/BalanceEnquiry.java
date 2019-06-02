package stepdefinitions;

import java.util.Properties;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.LoaderFunction;

public class BalanceEnquiry extends LoaderFunction {
	Properties homeProperties = locators("src//main//java//locators//homePage.properties");
	Properties balEnqProperties = locators("src//main//java//locators//balanceEnquiry.properties");
	private WebDriver driver;

	CommonStepsInApp steps = new CommonStepsInApp();

	public BalanceEnquiry() {
		driver = DriverUtils.getDriver();
	}

	@When("^User clicks Balance Enquiry link$")
	public void user_clicks_balance_enquiry_link() throws Throwable {
		click_element(driver, "linkText", homeProperties.getProperty("balance_enquiry_link_loc"));
	}

	@Then("^Balance amount in the given account id should be displayed$")
	public void check_if_balance_is_displayed() throws Throwable {
		String accountId = getText(driver, "xpath", balEnqProperties.getProperty("read_account_id_loc"));
		String depositAmount = getText(driver, "xpath", balEnqProperties.getProperty("read_deposited_amt_loc"));

	}
}
