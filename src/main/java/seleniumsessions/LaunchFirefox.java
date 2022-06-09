package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFirefox {

	public static void main(String[] args) {

		
		//System.setProperty("webdriver.gecko.driver", "/Users/naveenautomationlabs/Downloads/geckodriver");

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");//launch url
		String title = driver.getTitle();//get the title
		System.out.println(title);
		
		//validation/checkpoint/act vs exp result:
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		//Automation Steps (Selenium) + validation/checkpoint (Java/TestNG-Assertions) ==> Automation Testing
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();//close the browser

		
		
		
	}

}
