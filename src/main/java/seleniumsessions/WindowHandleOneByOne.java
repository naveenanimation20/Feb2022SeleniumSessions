package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleOneByOne {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");// parent window
		//String parentWindowId = driver.getWindowHandle();

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		Set<String> handles1 = driver.getWindowHandles();
		Iterator<String> it = handles1.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();
		
		driver.switchTo().window(childWindowId);
		driver.close();
		driver.switchTo().window(parentWindowId);
		
		//2
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		Set<String> handles2 = driver.getWindowHandles();
		Iterator<String> it2 = handles2.iterator();
		String parentWindowId2 = it2.next();
		String childWindowId2 = it2.next();
		
		driver.switchTo().window(childWindowId2);
		driver.close();
		driver.switchTo().window(parentWindowId2);
		
		
		
		
//		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
//		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		
		
		
		
	}

}
