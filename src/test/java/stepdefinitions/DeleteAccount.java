package stepdefinitions;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.LoaderFunction;

public class DeleteAccount extends LoaderFunction {
	Properties homeProperties = locators("src//main//java//locators//homePage.properties");
	Properties deleteProperties = locators("src//main//java//locators//deleteAccount.properties");
	private WebDriver driver;

	CommonStepsInApp steps = new CommonStepsInApp();

	public DeleteAccount() {
		driver = DriverUtils.getDriver();
	}

	@When("^Manager clicks Delete Account link$")
	public void manager_clicks_deposit_link() throws Throwable {
		click_element(driver, "linkText", homeProperties.getProperty("delete_account_link_loc"));
	}

	@And("^Manager enters valid Account id in the Account id field$")
	public void manager_enters_valid_account_id() throws Throwable {
		send_keys(driver, "xpath", deleteProperties.getProperty("accountno_txt_loc"), "61020");
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Then("^Account should be deleted succesfully$")
	public void check_if_amount_desposited() throws Throwable {		
		String accountId = getText(driver, "xpath", deleteProperties.getProperty("read_account_id_loc"));
		Assert.assertEquals("", "5000");

	}
}
