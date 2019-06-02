package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions   {
	static String actualResult = null;
	static WebElement element = null;
	static Select select = null;

	public static WebDriver driver;

	/**
	 * This method initialize browser object
	 * 
	 * @param browser
	 * @return browser driver
	 */
	public static WebDriver selectBrowser(String browser) {
		if (browser.equals("firefox") || browser.equals("FIREFOX")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		} else if (browser.equals("chrome") || browser.equals("CHROME")) {
			driver = new ChromeDriver();
			driver.manage().window().fullscreen();
			return driver;
		} else if (browser.equals("safari") || browser.equals("SAFARI")) {
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;
		}
		return null;
	}

	public static String navigate_to(WebDriver driver, String url) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().fullscreen();
		return null;
	}

	public static boolean is_displayed(WebDriver driver, String strLocType, String strLocValue)
			throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		for (int i = 0; i < 5; i++) {
			if (i >= 0) {
				Thread.sleep(1000);
			}
			
			try {
				switch (strLocType) {
				case "id":
					return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(strLocValue))).isDisplayed();
				case "xpath":
					return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strLocValue)))
							.isDisplayed();
				case "linkText":
					return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(strLocValue)))
							.isDisplayed();
				}
			} catch (Exception e) {
				continue;
			}
		}
		return false;
	}

	public static WebElement find_element(WebDriver driver, String strLocType, String strLocValue)
			throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		for (int i = 0; i < 5; i++) {
			if (i > 0) {
				Thread.sleep(1000);
			}
			try {
				switch (strLocType) {
				case "id":
					return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(strLocValue)));
				case "xpath":
					return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strLocValue)));
				case "linkText":
					return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(strLocValue)));
				}
			} catch (Exception e) {
				continue;
			}
		}
		return element;
	}

	public static String send_keys(WebDriver driver, String strLocType, String strLocValue, String param)
			throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 1);
		breakfor: for (int i = 0; i < 5; i++) {
			if (i > 0) {
				Thread.sleep(1000);
			}
			try {
				switch (strLocType) {
				case "id":
					wait.until(ExpectedConditions.presenceOfElementLocated(By.id(strLocValue))).sendKeys(param);
					break breakfor;
				case "xpath":
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(strLocValue))).sendKeys(param);
					break breakfor;
				}
			} catch (Exception e) {
				continue;
			}
		}
		return null;
	}

	public static WebElement clear_element(WebDriver driver, String strLocType, String strLocValue)
			throws InterruptedException {
		breakfor: for (int i = 0; i < 5; i++) {
			if (i > 0)
				Thread.sleep(1000);
			try {
				switch (strLocType) {
				case "id":
					element = driver.findElement(By.id(strLocValue));
					break breakfor;
				case "xpath":
					element = driver.findElement(By.xpath(strLocValue));
					break breakfor;
				case "linkText":
					element = driver.findElement(By.linkText(strLocValue));
					break breakfor;
				case "tagName":
					element = driver.findElement(By.tagName(strLocValue));
					break breakfor;
				}
			} catch (Exception e) {
				continue;
			}
		}
		element.clear();
		return element;
	}

	public static void move_to_element(WebDriver driver, String strLocType, String strLocValue)
			throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		Actions action = new Actions(driver);
		for (int i = 0; i < 5; i++) {
			if (i > 0) {
				Thread.sleep(1000);
			}
			try {
				if (strLocType.equals("xpath")) {
					// wait.until(ExpectedConditions.elementToBeClickable(By.xpath(strLocValue)));
					action.moveToElement(wait.until(ExpectedConditions.elementToBeClickable(By.xpath(strLocValue))));
				}
			} catch (Exception e) {
				continue;
			}
		}
	}

	public static void click_element(WebDriver driver, String strLocType, String strLocValue)
			throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		Actions action = new Actions(driver);
		WebElement element;
		boolean breakfor = false;
		for (int i = 0; i < 5; i++) {
			if (i > 0) {
				Thread.sleep(1000);
			}
			try {
				switch (strLocType) {
				case "id":
					wait.until(ExpectedConditions.elementToBeClickable(By.id(strLocValue)));
					element = driver.findElement(By.id(strLocValue));
					action.moveToElement(element).click().perform();
					breakfor = true;
					break;
				case "xpath":
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath(strLocValue)));
					element = driver.findElement(By.xpath(strLocValue));
					element.click();
					// action.moveToElement(element).click().perform();
					breakfor = true;
					break;
				case "linkText":
					wait.until(ExpectedConditions.elementToBeClickable(By.linkText(strLocValue)));
					element = driver.findElement(By.linkText(strLocValue));
					action.moveToElement(element).click().perform();
					breakfor = true;
					break;
				case "tagName":
					wait.until(ExpectedConditions.elementToBeClickable(By.tagName(strLocValue)));
					element = driver.findElement(By.tagName(strLocValue));
					action.moveToElement(element).click().perform();
					break;
				}
				if (breakfor)
					break;
				else
					continue;
			} catch (Exception e) {
				continue;
			}
		}

	}

	public static Select selectByVisibleText(WebDriver driver, String strLocType, String strLocValue, String value)
			throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		breakfor: for (int i = 0; i < 5; i++) {
			if (i > 0)
				Thread.sleep(1000);
			try {
				switch (strLocType) {
				case "id":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(strLocValue)));
					select = new Select(element);
					select.selectByVisibleText(value);
					break breakfor;
				case "xpath":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strLocValue)));
					select = new Select(element);
					select.selectByVisibleText(value);
					break breakfor;
				case "linkText":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(strLocValue)));
					select = new Select(element);
					select.selectByVisibleText(value);
					break breakfor;
				case "tagName":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(strLocValue)));
					select = new Select(element);
					select.selectByVisibleText(value);
					break breakfor;
				}
			} catch (Exception e) {
				continue;
			}
		}
		return select;
	}

	public static Select selectByIndex(WebDriver driver, String strLocType, String strLocValue, int value)
			throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		breakfor: for (int i = 0; i < 5; i++) {
			if (i > 0)
				Thread.sleep(1000);
			try {
				switch (strLocType) {
				case "id":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(strLocValue)));
					select = new Select(element);
					select.selectByIndex(value);
					break breakfor;
				case "xpath":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strLocValue)));
					select = new Select(element);
					select.selectByIndex(value);
					break breakfor;
				case "linkText":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(strLocValue)));
					select = new Select(element);
					select.selectByIndex(value);
					break breakfor;
				case "tagName":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(strLocValue)));
					select = new Select(element);
					select.selectByIndex(value);
					break breakfor;
				}
			} catch (Exception e) {
				continue;
			}
		}
		return select;
	}

	public static Select selectByValue(WebDriver driver, String strLocType, String strLocValue, String value)
			throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		breakfor: for (int i = 0; i < 5; i++) {
			if (i > 0)
				Thread.sleep(1000);
			try {
				switch (strLocType) {
				case "id":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(strLocValue)));
					select = new Select(element);
					select.selectByValue(value);
					break breakfor;
				case "xpath":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strLocValue)));
					select = new Select(element);
					select.selectByValue(value);
					break breakfor;
				case "linkText":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(strLocValue)));
					select = new Select(element);
					select.selectByValue(value);
					break breakfor;
				case "tagName":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(strLocValue)));
					select = new Select(element);
					select.selectByValue(value);
					break breakfor;
				}
			} catch (Exception e) {
				continue;
			}
		}

		return select;
	}

	public static boolean minimumPasswordRequirement(WebDriver driver, String password, Properties properties) {
		int upper = 0, lower = 0, number = 0, special = 0;
		int count = 0;

		String expected = "visibility: visible;";
		// List to add all the special characters in the given password
		ArrayList<Character> specialChar = new ArrayList<Character>();
		// List to add special characters
		List<String> charList = new ArrayList<String>(
				Arrays.asList("!", "#", "$", "%", "&", "\\", "\'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";",
						"<", ">", "=", "?", "@", "[", "]", "\\\\", "]", "^", "`", "{", "}", "|", "~", "\""));

		// Length to iterate and check password criteria
		int passwordLength = password.length();
		try {
			// Iterate through the length of the password and check by each
			// character
			for (int i = 0; i < passwordLength; i++) {
				char pwdCharacter = password.charAt(i);
				if (pwdCharacter >= 'A' && pwdCharacter <= 'Z') {
					upper++;
					count++;
					String upperCaseConstraint = getAttribute(driver, "xpath",
							properties.getProperty("upperCaseConstraint"), "style");

				} else if (pwdCharacter >= 'a' && pwdCharacter <= 'z') {
					lower++;
					count++;
					String lowerCaseConstraint = getAttribute(driver, "xpath",
							properties.getProperty("lowerCaseConstraint"), "style");

				} else if (pwdCharacter >= '0' && pwdCharacter <= '9') {
					number++;
					count++;
					String numberConstraint = getAttribute(driver, "xpath", properties.getProperty("numberConstraint"),
							"style");

				} else {
					count++;
					// add special characters to specialChar list
					specialChar.add(pwdCharacter);
					boolean specialCharacters = charList.contains(Character.toString(pwdCharacter));
					if (specialCharacters == true) {
						special++;
						String splCharConstraint = getAttribute(driver, "xpath",
								properties.getProperty("splCharConstraint"), "style");
					}
				}
			}
			// To check password constraints
			if (count >= 8 && upper >= 1 && lower >= 1 && number >= 1 && special >= 1) {
				String passwordConstraint = getAttribute(driver, "xpath", properties.getProperty("passwordConstraint"),
						"style");
				return true;
			} else {
				throw new Exception();
			}

		} catch (Exception e) {
			return false;
		}
	}

	public static String getText(WebDriver driver, String strLocType, String strLocValue) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		breakfor: for (int i = 0; i < 5; i++) {
			if (i > 0)
				Thread.sleep(1000);
			try {

				switch (strLocType) {
				case "id":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(strLocValue)));
					actualResult = element.getText();
					break breakfor;
				case "xpath":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strLocValue)));
					actualResult = element.getText();
					break breakfor;
				case "linkText":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(strLocValue)));
					actualResult = element.getText();
					break breakfor;
				case "tagName":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(strLocValue)));
					actualResult = element.getText();
					break breakfor;
				}
			} catch (Exception e) {
				continue;
			}
		}
		return actualResult;
	}

	public static String getAttribute(WebDriver driver, String strLocType, String strLocValue, String attribute)
			throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 3);
		breakfor: for (int i = 0; i < 5; i++) {
			if (i > 0)
				Thread.sleep(1000);
			try {

				switch (strLocType) {
				case "id":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(strLocValue)));
					actualResult = element.getAttribute(attribute);
					break breakfor;
				case "xpath":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strLocValue)));
					actualResult = element.getAttribute(attribute);
					break breakfor;
				case "linkText":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(strLocValue)));
					actualResult = element.getAttribute(attribute);
					break breakfor;
				case "tagName":
					element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(strLocValue)));
					actualResult = element.getAttribute(attribute);
					break breakfor;
				}
			} catch (Exception e) {
				continue;
			}
		}
		return actualResult;
	}

	public static boolean is_enabled(WebDriver driver, String strLocType, String strLocValue)
			throws InterruptedException {
		breakfor: for (int i = 0; i < 5; i++) {
			if (i > 0)
				Thread.sleep(1000);
			try {

				switch (strLocType) {
				case "id":
					element = driver.findElement(By.id(strLocValue));
					break breakfor;
				case "xpath":
					element = driver.findElement(By.xpath(strLocValue));
					break breakfor;
				case "linkText":
					element = driver.findElement(By.linkText(strLocValue));
					break breakfor;
				case "tagName":
					element = driver.findElement(By.tagName(strLocValue));
					break breakfor;
				}
			} catch (Exception e) {
				continue;
			}
		}
		return element.isEnabled();
	}

	public WebDriver scrollingToElementofAPage(WebDriver driver, WebElement item) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", item);
		return driver;
	}

	public static void quit_driver(WebDriver driver) {
		driver.quit();
	}
}
