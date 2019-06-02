package stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class DriverUtils {
	private static boolean initialized = false;
	private static WebDriver driver;

	@Before
	public void initialize() {
		if (!initialized) {
			initialized = true;
			driver = new ChromeDriver();

		}
	}
	public static WebDriver getDriver() {
		return driver;
	}

//	@After
//	public void tearDown() throws InterruptedException {
//		driver.quit();
//	}
}
