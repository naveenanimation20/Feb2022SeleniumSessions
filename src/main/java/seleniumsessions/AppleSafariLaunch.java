package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppleSafariLaunch {

	public static void main(String[] args) {

		//WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();
		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();

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
