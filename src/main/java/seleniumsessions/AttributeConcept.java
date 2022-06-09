package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
//		String place = driver.findElement(By.id("Form_submitForm_Email")).getAttribute("placeholder");
//		System.out.println(place);
//		
//		driver.findElement(By.id("Form_submitForm_Name")).sendKeys("Naveen");
//		String value = driver.findElement(By.id("Form_submitForm_Name")).getAttribute("value");
//		System.out.println(value);
		
		By email = By.id("Form_submitForm_Email");
		By name = By.id("Form_submitForm_Name");
		System.out.println(doGetAttributeValue(email, "placeholder"));
		
		doSendKeys(name, "Naveen AutomationLabs");
		System.out.println(doGetAttributeValue(name, "value"));
		
		if(doIsDisplayed(email)) {
			System.out.println("true");
		}

	}
	
	
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static String doGetAttributeValue(By locator, String attributeName) {
		return getElement(locator).getAttribute(attributeName);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	

}
