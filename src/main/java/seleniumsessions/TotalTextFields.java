package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalTextFields {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		By textFields = By.className("form-control");
		ElementUtil eleUtil = new ElementUtil(driver);
		int textFieldCount = eleUtil.getElementsCount(textFields);
		System.out.println(textFieldCount);

	}

}
