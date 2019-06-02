package stepdefinitions;

import java.util.Properties;
import utils.LoaderFunction;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage extends LoaderFunction {
	Properties properties = locators("src//main//java//locators//login.properties");
	private WebDriver driver;

    public LoginPage() {
        driver = DriverUtils.getDriver();
    }
	@Given("^Login url of the application$")
	public void login_url_of_the_application() {
		driver.manage().window().fullscreen();
		driver.get(properties.getProperty("login_url"));
	}

	@When("^User enters a valid username$")
	public void user_enters_a_valid_username() throws Throwable {
		send_keys(driver, "xpath", properties.getProperty("user_id_txt_loc"), "mngr199145");
	}

	@When("^User enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {
		send_keys(driver, "xpath", properties.getProperty("password_loc"), "zyvajad");
	}

	@Then("^User should be logged in successfully$")
	public void user_should_be_logged_in_successfully() throws Throwable {
		click_element(driver, "xpath", properties.getProperty("login_btn_loc"));
	}
	
}
