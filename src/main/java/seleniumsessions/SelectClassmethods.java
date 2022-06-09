package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassmethods {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//drop down -- html tag --> <select> --> <option>
		//Select class
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country = By.id("Form_submitForm_Country");
		By state = By.id("Form_submitForm_State");
		
		Select select = new Select(driver.findElement(country));
		
//		select.deselectAll();
//		
//		select.deselectByVisibleText(text);
		
		//System.out.println(select.isMultiple());
		
		//select.getAllSelectedOptions();
		
		
	}

}
