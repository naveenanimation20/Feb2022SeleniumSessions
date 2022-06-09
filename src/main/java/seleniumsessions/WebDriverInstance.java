package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverInstance {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");

		WebDriver driver1 = new ChromeDriver();
		WebDriver driver2 = new ChromeDriver();
		WebDriver driver3 = new ChromeDriver();
		
		driver1.get("https://www.google.com");
		driver2.get("https://www.amazon.com");
		driver3.get("https://www.flipkart.com");

	}

}
