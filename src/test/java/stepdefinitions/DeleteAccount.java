package stepdefinitions;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.JsonDataReader;
import utils.LoaderFunction;

public class DeleteAccount extends LoaderFunction {
	Properties homeProperties = locators("src//main//java//locators//homePage.properties");
	Properties deleteProperties = locators("src//main//java//locators//deleteAccount.properties");
	Properties commonProperties = locators("src//main//java//locators//commonLocators.properties");

	private WebDriver driver;
	JsonDataReader readObj = new JsonDataReader();

	CommonStepsInApp steps = new CommonStepsInApp();

	public DeleteAccount() {
		driver = DriverUtils.getDriver();
	}

	@When("^Manager clicks Delete Account link$")
	public void manager_clicks_deposit_link() throws Throwable {
		click_element(driver, "linkText", homeProperties.getProperty("delete_account_link_loc"));
	}

	@And("^Manager enters valid \\\"(.*)\\\" in the Account id field$")
	public void manager_enters_valid_account_id(String account_id) throws Throwable {
		send_keys(driver, "xpath", deleteProperties.getProperty("accountno_txt_loc"),
				readObj.retrievevalue(account_id));
	}
	
	@And("^Manager accepts the alert$")
	public void accept_alert()throws Throwable{
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.accept();
	}

	@Then("^\\\"(.*)\\\" should be deleted succesfully$")
	public void check_if_account_deleted(String account_id) throws Throwable {
		click_element(driver, "linkText", homeProperties.getProperty("edit_account_link_loc"));
		send_keys(driver, "xpath", commonProperties.getProperty("accountno_txt_loc"),
				readObj.retrievevalue(account_id));
		click_element(driver, "xpath", commonProperties.getProperty("submit_btn_loc"));
		Alert alert = driver.switchTo().alert();
		String message = alert.getText();
		alert.accept();
		Assert.assertEquals(message, "Account does not exist");
	}
}
