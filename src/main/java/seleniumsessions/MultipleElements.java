package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleElements {

	static WebDriver driver;

	public static void main(String[] args) {

		// FE --- single element
		// FEs --- multiple elements

		// url: page
		// find out total number of links on the page -- print count of links
		// print the text of each link on the console
		// ignore those links which are having an empty text

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");

		// links --> <a> tag name
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println("total links: " + linksList.size());

//		for (int i = 0; i < linksList.size(); i++) {
//			String text = linksList.get(i).getText();
//			String hrefVal = linksList.get(i).getAttribute("href");
//			if (!text.isEmpty()) {
//				System.out.println(text + ":" + hrefVal);
//			}
//
//		}
		
		//foreach loop:
//		for(WebElement e : linksList) {
//			String text = e.getText();
//			String hrefVal = e.getAttribute("href");
//				if(!text.isEmpty()) {
//					System.out.println(text + " : " + hrefVal);
//				}
//		}
		
		//Java Streams:
		//linksList.stream().forEach(ele -> System.out.println(ele.getText()));
//		linksList
//			.stream()
//				.filter(e -> !e.getText().isEmpty())
//					.forEach(e -> System.out.println(e.getText()));
		
		//
		linksList
			.parallelStream()
				.filter(e -> !e.getText().isEmpty())
					.forEach(e -> System.out.println(e.getText()));
		

	}
	
	
	
	
	
	
	
	
	
	
	

}
