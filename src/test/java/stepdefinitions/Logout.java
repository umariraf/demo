package stepdefinitions;

import java.util.Properties;
import utils.LoaderFunction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Logout extends LoaderFunction {
	Properties properties = locators("src//main//java//locators//homePage.properties");
	private WebDriver driver;
	LoginPage login = new LoginPage();

	public Logout() {
		driver = DriverUtils.getDriver();
	}

	@Given("^User is successfully logged in and the session is active$")
	public Boolean user_is_successfully_logged_in_and_the_session_is_active() throws Throwable {
		Boolean is_logged_in = false;
		try {
			is_logged_in = is_displayed(driver, "linkText", properties.getProperty("logout_link_loc"));
		} catch (InterruptedException e) {
			e.getMessage();
		}
		return is_logged_in;
	}

	@Then("^User clicks the logout button and is logged out successfully$")
	public void user_clicks_the_logout_button() throws Throwable {
		Boolean is_logged_in = user_is_successfully_logged_in_and_the_session_is_active();
		if (is_logged_in) {
			click_element(driver, "linkText", properties.getProperty("logout_link_loc"));
			Alert alert = driver.switchTo().alert();
			alert.accept();

		}

	}

}
