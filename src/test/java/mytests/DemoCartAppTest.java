package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoCartAppTest extends BaseTest{

	@Test(priority = 1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title is : " + title);
		Assert.assertEquals(title, "Account Login");
	}

	@Test(priority = 2)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("page url is : " + url);
		Assert.assertTrue(url.contains("route=account/login"));

	}

	@Test(priority = 3)
	public void searchTest() {
		Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());

	}

}
