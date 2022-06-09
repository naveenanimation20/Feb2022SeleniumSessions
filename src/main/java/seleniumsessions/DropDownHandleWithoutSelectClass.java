package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country = By.xpath("//select[@id='Form_submitForm_Country']/option");
		selectValueFromDropDown(country, "India");
	}

	public static void selectValueFromDropDown(By locator, String value) {
		List<WebElement> countryOptions = driver.findElements(locator);
		System.out.println(countryOptions.size());
		for (int i = 0; i < countryOptions.size(); i++) {
			String text = countryOptions.get(i).getText();
			System.out.println("============" + text + "============");
			if (text.contains(value)) {
				countryOptions.get(i).click();
				break;
			}
		}
	}

}
