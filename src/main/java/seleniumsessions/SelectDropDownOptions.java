package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownOptions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// drop down -- html tag --> <select> --> <option>
		// Select class
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By country = By.id("Form_submitForm_Country");
		By state = By.id("Form_submitForm_State");
		//printSelectDropDownValues(country);
//		selectValueFromSelectDropDown(country, "India");
//		Thread.sleep(5000);
//		selectValueFromSelectDropDown(state, "Goa");
		
		
		List<String> countryList = getSelectDropDownValuesList(country);
		if(countryList.contains("India")) System.out.println("PASS");
		if(countryList.contains("Brazil")) System.out.println("PASS");
		if(countryList.contains("Angola")) System.out.println("PASS");

		
//		Select select = new Select(driver.findElement(country));
//
//		List<WebElement> countryOptions = select.getOptions();
//		System.out.println(countryOptions.size());
//
//		for (WebElement e : countryOptions) {
//			String text = e.getText();
//			System.out.println("================" + text + "==============");
//			if (text.equals("India")) {
//				e.click();
//				break;
//			}
//		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getSelectDropDownValueCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<String> getSelectDropDownValuesList(By locator) {
		List<String> valuesList = new ArrayList<String>();
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();

		for (WebElement e : optionsList) {
			String text = e.getText();
			valuesList.add(text);
		}
		return valuesList;
	}
	
	public static void selectValueFromSelectDropDown(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();

		for (WebElement e : optionsList) {
			String text = e.getText();
				if(text.contains(value)) {
					e.click();
					break;
				}
		}
	}

	public static void printSelectDropDownValues(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println("================" + text + "==============");

		}
	}

}
