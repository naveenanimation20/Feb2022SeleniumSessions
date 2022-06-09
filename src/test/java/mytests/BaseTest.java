package mytests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;

	@BeforeTest
	@Parameters({ "browser", "url", "headless" })
	public void setUp(String browserName, String appURL, String headLess) {

		System.out.println("browser name is : " + browserName);

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions co = new ChromeOptions();
			
			if(Boolean.parseBoolean(headLess)) {
				co.setHeadless(true);
			}
			driver = new ChromeDriver(co);

		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();

		}
		else {
			System.out.println("please pass the right browser..." + browserName);
		}
		driver.get(appURL);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
