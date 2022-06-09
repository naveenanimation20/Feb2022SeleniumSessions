package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightPanelLinksList {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By rightPanelLinks = By.xpath("//aside[@id='column-right']//a");
		List<String> actEleTextList = getElementsTextList(rightPanelLinks);
		System.out.println(actEleTextList);
		
		if(actEleTextList.contains("Register")) {
			System.out.println("PASS");
		}
		
		//printAllElementsText(rightPanelLinks);

//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.clickOnElementFromSection(rightPanelLinks, "Forgotten Password");

	}

	public static int getElementsListCount(By locator) {
		return driver.findElements(locator).size();
	}

	public static List<String> getElementsTextList(By locator) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = driver.findElements(locator);
		for (WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}

	public static void printAllElementsText(By locator) {
		List<WebElement> eleList = driver.findElements(locator);
		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println("===============" + text + "===============");
		}

	}

}
