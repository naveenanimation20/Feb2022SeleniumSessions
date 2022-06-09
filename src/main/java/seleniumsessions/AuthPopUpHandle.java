package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUpHandle {

	public static void main(String[] args) {

		// pop up is coming with auth username/password fields
		// this is not JS pop up

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String username = "admin";
		String password = "admin";

		driver.get("https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");

	}

}
