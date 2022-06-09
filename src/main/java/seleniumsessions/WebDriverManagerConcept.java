package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {

		//WDM -- bonigarcia
		
		
		//
		//chrome 97 ---> chromedriver 97.exe
		//chrome 98 ---> chromedriver 98.exe
		//chrome 99 ---> chromedriver 99.exe
		//chrome 97 ---> chromedriver 97.exe
		//chrome 99 ---> chromedriver 99.exe
		//chrome 100 ---> chromedriver 100.exe

		//System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();//launch chrome
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
