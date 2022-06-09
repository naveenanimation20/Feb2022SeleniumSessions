package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinks {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.freshworks.com/ae/");

		By footers = By.xpath("//footer//ul[@class='footer-nav']//a");
		clickOnElementFromSection(footers, "Customers");
	}

	public static void clickOnElementFromSection(By locator, String value) {
		List<WebElement> eleList = driver.findElements(locator);

		System.out.println(eleList.size());

		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println("=================" + text + "==================");
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}

}
