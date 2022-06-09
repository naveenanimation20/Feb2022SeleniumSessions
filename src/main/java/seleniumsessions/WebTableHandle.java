package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//xpath axes:
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input
		selectUser("Joe.Root");
		selectUser("Jasmine.Morgan");

		//locator - 15%
		//framework -- 80%
		//test report
		//syntax of the code
		//a[text()='Joe.Root']/parent::td/following-sibling::td
		System.out.println(getUserData("Joe.Root"));
		System.out.println(getUserData("Jasmine.Morgan"));
	}
	
	public static List<String> getUserData(String name) {
		System.out.println("user name is : " + name);
		List<WebElement> colEle = 
					driver.findElements(By.xpath("//a[text()='"+name+"']/parent::td/following-sibling::td"));
		List<String> colList = new ArrayList<String>();
		for(WebElement e  : colEle) {
			String text = e.getText();
			colList.add(text);
		}
		return colList;
	}
	
	public static void selectUser(String name) {
		String xpath = "//a[text()='"+name+"']/parent::td/preceding-sibling::td/input";
		driver.findElement(By.xpath(xpath)).click();
	}

}
