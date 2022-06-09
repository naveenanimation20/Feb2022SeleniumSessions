package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerWithList {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		//child window will be opened
		//window handler api
		Set<String> handles = driver.getWindowHandles();
		
		//set to list:
		List<String> winList = new ArrayList<String>(handles);
		
		String parentWinId = winList.get(0);
		String childWinId = winList.get(1);
		
		driver.switchTo().window(childWinId);
		System.out.println(driver.getTitle());
		
		driver.close();//close the child window
		
		driver.switchTo().window(parentWinId);
		System.out.println(driver.getTitle());

		driver.close();//close parent window

		
	}

}
