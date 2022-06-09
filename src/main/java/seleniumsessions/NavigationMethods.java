package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) {

		// Navigation Methods : back, forward, refresh

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();// launch chrome
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

		//driver.navigate().to("https://www.amazon.com");
		
		try {
			driver.navigate().to(new URL("https://www.amazon.com"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		//driver.get("https://www.amazon.com");
		
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().forward();
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();

	}

}
