package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {

		// FE --- single element
		// FEs --- multiple elements

		// url: page
		// find out total number of images on the page -- print count of links
		// print the src/alt of each image on the console

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		By images = By.tagName("img");
		By links = By.tagName("a");
		int linksCount = getElementsCount(links);
		int imagesCount = getElementsCount(images);
		
		System.out.println(linksCount + ":" + imagesCount);

		
//		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
//		System.out.println("total images : " + imagesList.size());
//		
//		for(WebElement e : imagesList) {
//			String srcVal = e.getAttribute("src");
//			String altVal = e.getAttribute("alt");
//			String htValue = e.getAttribute("height");
//			System.out.println(srcVal);
//			System.out.println(altVal);
//			System.out.println(htValue);
//		}		
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	
	
	
	
	
	

}
