package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlylWaitConcept {

	public static void main(String[] args) {
		
		//ImplicitlylWait: dynamic wait
		//global wait
		//it will be applied on all the web elements by default
		//it can not be used for the custom wait
		//not applicable for non web elements: url, title, alert

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//sel3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel4.x
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//sign up:
		driver.findElement(By.id("Form_submitForm_Name11")).sendKeys("Naveen");//10 - 5 = 5
		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("Naveen@gmail.com");
		driver.findElement(By.id("Form_submitForm_Contact")).sendKeys("9898989898");

		//home page: 5 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//sel4.x
		//e4 
		//e5
		//e6
		//go to sign up page: 10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel4.x
		//e1
		//e2
		//e3
		//cart page: 15 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//sel4.x
		//go to sign up page: 10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel4.x

		//register page: 0 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));//sel4.x
		//home page:0
		//cart page:0
		
		
	}

}
