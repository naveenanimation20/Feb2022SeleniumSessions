package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSPopUpHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(4000);
		
		//Js pop up: alert:
		//can not inspect the element
		//pop up is coming coz of alert()
		//it will freeze the page as well
		//it might have some text on it
		//JS pop up methods:
		//1. alert("mesg")
		//2. pompt("plz enter user id")
		//3. confirm("are you sure?")
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		//alert.sendKeys("admin");
		
		alert.accept();//just click on ok///accept the alert
		//alert.dismiss(); //no need to accept the alert ---> press esc 
		
		
		
		
	}

}
