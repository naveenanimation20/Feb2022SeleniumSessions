package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {

		// Browser --> Page (elements)
		// ---> frame ---> elements

		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		String text = driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println("=============="+text+"============");
		
		//driver.switchTo().defaultContent();//come back to the main page
		driver.switchTo().parentFrame();//sel 4.x
		driver.switchTo().defaultContent();////come back to the main page

		//1. frame
		//2. iframe
		
		
	}

}
