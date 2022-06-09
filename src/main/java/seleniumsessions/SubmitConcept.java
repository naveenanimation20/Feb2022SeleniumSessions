package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// drop down -- html tag --> <select> --> <option>
		// Select class
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		
		//driver.findElement(By.id("email11")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("passwd")).sendKeys("test@123");
//		driver.findElement(By.id("passwd")).submit();
		
		
		//WE --> NoSuchElementException
		List<WebElement> list = driver.findElements(By.className("naveen"));
		System.out.println(list.size());
		
		//driver.findElement(By.xpath("@///test[test='naveen']")).click();
		//InvalidSelectorException
		
		//ElementNotInteractableException -- any actions
		//ElementClickInterceptedException --> click actions
		
		//IllelgalStateException: chromerdriver.exe file path is not defined
		//InvalidArgumentException: https:// is missing
		
		
		
	}

}
