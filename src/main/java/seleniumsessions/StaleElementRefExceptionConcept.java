package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefExceptionConcept {

	public static void main(String[] args) throws InterruptedException {

		//Browser --> Page -- DOM -- v1
		//ele -- sk
		//refresh the page -- DOM -- v2
		//ele -- sk?
				
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login"); //DOM - v1
		WebElement userId = driver.findElement(By.id("input-email")); //v1
		userId.sendKeys("test@gmail.com");
		driver.navigate().refresh();
		//back
		//forward
		//DOM--v2
		userId = driver.findElement(By.id("input-email"));//v2
		userId.sendKeys("naveen@gmail.com");//v2
		//StaleElementReferenceException: stale element reference: element is not attached to the page document
	}

}
