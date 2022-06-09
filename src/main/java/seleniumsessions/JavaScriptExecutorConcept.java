package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {

		
		//script -- java
		//browser --> JS
		//JS code -- with selenium + java -- JSExecutor
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		String title = jsUtil.getTitleByJS();
//		System.out.println(title);
		
		//jsUtil.refreshBrowserByJS();
		
		//jsUtil.generateAlert("this is my login page....");
		
//		String pageText = jsUtil.getPageInnerText();
//		if(pageText.contains("Marketing Campaigns")) {System.out.println("PASS");}
//		if(pageText.contains("Mobile iOS & Android")) {System.out.println("PASS");}
//		if(pageText.contains("Forgot Password?")) {System.out.println("PASS");}

//		WebElement emailId = driver.findElement(By.name("username"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
//		WebElement form = driver.findElement(By.id("loginForm"));
		//jsUtil.drawBorder(form);
		
//		jsUtil.flash(form);
//		jsUtil.flash(emailId);
//		emailId.sendKeys("test@gmail.com");
		
		//jsUtil.clickElementByJS(login);
		//jsUtil.sendKeysUsingWithId("input-email", "test123@gmail.com");
		
//		jsUtil.scrollPageDown();
//		Thread.sleep(2000);
//		jsUtil.scrollPageUp();
//		Thread.sleep(2000);
//		jsUtil.scrollPageDown("1000");
		WebElement ele = driver.findElement(By.xpath("//span[text()='Top Sellers in Books for you']"));
		jsUtil.scrollIntoView(ele);
		
		
	}

}
