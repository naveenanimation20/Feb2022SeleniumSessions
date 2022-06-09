package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// create web element(using By locators) + actions (click, send keys, get text,
		// isDisplayed)

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		// 1. id:

		// 1.
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");

		// 2.
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emailId.sendKeys("naveen@gmail.com");
//		password.sendKeys("test@123");
//		//logout
//		//login

		// 3. By locator:
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement email_ele = driver.findElement(emailId);
//		WebElement pwd_ele = driver.findElement(password);
//		
//		email_ele.sendKeys("navee@gmail.com");
//		pwd_ele.sendKeys("test@123");

		// 4. By locator with a generic method: getElement()
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(emailId).sendKeys("naveen@gmail.com");
//		getElement(password).sendKeys("test@123");

		// 5. By locator OR with a generic method: getElement() + actionsMethod
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		doSendKeys(emailId, "naveen@gmail.com");
//		doSendKeys(password, "test@123");

		// 6. By locator OR with generic methods in ElementUtil class
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(emailId, "naveen@gmail.com");
//		eleUtil.doSendKeys(password, "test@123");

		// 7. String locator OR with generic methods in ElementUtil class
		String email_id = "input-email";
		String password_id = "input-password";
		
		doSendKeys(getBy("Id", email_id), "naveen@gmail.com");
		doSendKeys(getBy("id", password_id), "test@123");

	}

	public static By getBy(String locatorType, String locatorValue) {

		By locator = null;

		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;

		default:
			System.out.println("please pass the right locator....");
			break;
		}

		return locator;

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
