package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	//webdriver : automation library/tool -- only for web automation
	//test clients : TestNG/Junit -- test cases -- JAVA
	//Php : PhpUnit, C#: Nunit, Python: Pytest, JS: Jasmine, Mocha
	//cross browsers: chrome, edge, ff, safari, opera, ie
	//open source: free
	//OS: MAc, Windows, Linux
	//does not support desktop application
	//it should not be used for performance testing as well
	//functional tool
	//mobile apps: not supported
	//hardward testing: not supported
	//java, c#, python, JS, Ruby, Go
	

	public static void main(String[] args) {

		//setup binary file: chromedriver.exe -- mac/win/linux
		//Google --> Chromium
		//mac :
		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		//wind:
		//System.setProperty("webdriver.chrome.driver", "c:\\documents\\driver\\chromedriver.exe");

		//Automation Steps:
		WebDriver driver = new ChromeDriver();//launch chrome
		
		driver.get("www.google.com");//launch url
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
