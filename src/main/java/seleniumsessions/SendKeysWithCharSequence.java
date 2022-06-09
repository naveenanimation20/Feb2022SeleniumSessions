package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysWithCharSequence {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		String str = "Naveen";
		String str1 = "Admin";
		StringBuilder str3 = new StringBuilder("Automation");
		StringBuffer str4 = new StringBuffer("Labs");

		driver.findElement(By.id("Form_submitForm_Name")).sendKeys(str + " " + str1 + " "+ str3 + " " + str4 + "testing");
		
	}

}
