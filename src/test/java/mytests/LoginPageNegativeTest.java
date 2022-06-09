package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest extends BaseTest{

	
	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			
			{"test121212@gmail.com", "test@12121212"},
			{"naveenanimation20@gmail.com", "test@12121212"},
			{"test121212@.@.@gmail.com", "test@12121212121"},
			{"  ", "   "},
			{"!@#!@#!@#", "test12121"}
			
		};
	}
	
	

	@Test(dataProvider = "getLoginData")
	public void loginWithWrongDataTest(String username, String password) {
		driver.get("http://opencart.antropy.co.uk/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String errorMsg = 
					driver.findElement(By.cssSelector("div.alert.alert-danger")).getText();
		
		System.out.println(errorMsg);
		Assert.assertTrue(errorMsg.contains("Warning: No match for E-Mail Address and/or Password"));
		
	}




}


