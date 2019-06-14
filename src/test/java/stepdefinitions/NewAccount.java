package stepdefinitions;

import java.util.Properties;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.JsonDataReader;
import utils.LoaderFunction;

public class NewAccount extends LoaderFunction {
	Properties homeProperties = locators("src//main//java//locators//homePage.properties");
	Properties newAccountProperties = locators("src//main//java//locators//newAccountPage.properties");
	private WebDriver driver;
	JsonDataReader readObj = new JsonDataReader();

	public NewAccount() {
		driver = DriverUtils.getDriver();
	}

	@When("^Manager clicks New Account link$")
	public void manager_clicks_new_account_link() throws Throwable {
		click_element(driver, "linkText", homeProperties.getProperty("new_account_link_loc"));
	}

	@When("^Manager enters valid \\\"(.*)\\\" in the customer id field$")
	public void manager_enters_valid_customer_id(String cust_id) throws Throwable {
		send_keys(driver, "xpath", newAccountProperties.getProperty("customer_id_txt_loc"), readObj.retrievevalue(cust_id));
	}

	@When("^Manager chooses a valid account type$")
	public void manager_chooses_a_valid_account_type() throws Throwable {
		selectByVisibleText(driver, "xpath", newAccountProperties.getProperty("account_type_dropdown_loc"), "Savings");
	}

	@When("^Manager enters valid initial deposit amount$")
	public void manager_enters_valid_initial_deposit_amount() throws Throwable {
		send_keys(driver, "xpath", newAccountProperties.getProperty("initial_deposit_txt_loc"), "5000");
	}

	@Then("^New customer account for \\\"(.*)\\\" should be created successfully$")
	public void new_customer_account_should_be_created_successfully(String cust_id) throws Throwable {
		String accountId = getText(driver, "xpath", newAccountProperties.getProperty("read_account_id_loc"));
		String custId = getText(driver, "xpath", newAccountProperties.getProperty("read_cust_id_loc"));
		readObj.writeValue("account_id", accountId);
		Assert.assertEquals(custId, readObj.retrievevalue(cust_id) );
	}
}
