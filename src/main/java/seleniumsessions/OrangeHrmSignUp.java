package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmSignUp {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		
		WebDriver driver = brUtil.init_driver("chrome");
		brUtil.navigateUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());
		
		//By Locators - OR
		By fullName = By.id("Form_submitForm_Name");
		By emailId = By.id("Form_submitForm_Email");
		By phone = By.id("Form_submitForm_Contact");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(fullName, "Naveen Atuomation");
		eleUtil.doSendKeys(emailId, "navee@gmail.com");
		eleUtil.doSendKeys(phone, "9898989898");
		
		//brUtil.quitBrowser();
	}

}
