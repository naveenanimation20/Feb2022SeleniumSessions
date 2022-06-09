package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath_1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		//xpath : address of the element in DOM
		//abs xpath: /html/body/div[2]/form/div[1]/ul/li[3]/a
		//relative xpath: custom xpath:
		//
		//html tag[@attr='value']
		By name = By.xpath("input[@id=\"input-email\"]");
		//input[@id='input-email']		
		//input[@type='text']
		
		//htmltag[@attr1='value' and @attr2='value']
		//input[@id='input-email' and @name='email']
		//input[@type='text' and @name='email']
		//input[@type='text' or @name='search']
		//input[@type='submit' and @value='Login']
		
		//index/position in xpath:
		// (//input[@class='form-control'])[1]
		By.xpath("(//input[@class='form-control'])[1]");
		// (//input[@class='form-control'])[position()=3]
		// (//input[@class='form-control'])[last()]
		// (//input[@class='form-control'])[last()-1]
		
		String helpEle = driver
		.findElement
			(By.xpath("((//div[@class='navFooterLinkCol navAccessibility']/ul)[last()]/li)[last()]/a"))
					.getText();
		
		System.out.println(helpEle);
		
		// ((//div[@class='navFooterLinkCol navAccessibility']/ul)[position()=1]/li)[last()]/a
		
		//text():
		//htmltag[text()='value']
		//h2[text()='Gaming accessories']
		//a[text()='Registry']
		//label[text()='First Name']
		
		//contains() with attr:
		//htmltag[contains(@attr,'value')]
		//input[contains(@id,'email')]
		//whenever u have dynamic attributes
		//input id="email_123"
		//input id="email_345"
		//input id="email_222"
		//input[contains(@id,'email_')]

		//contains() with attr1 and attr2(without contains):
		//htmltag[contains(@attr1,'value') and @attr2='value']
		//input[contains(@id,'email') and @name='email' and @type='text']
		//input[@name='email' and @type='text' and contains(@id,'email')]
		
		//contains() with text():
		//fetch all the links which contains amazon text
		//htmltag[contains(text(),'value')]
		//a[contains(text(),'Amazon')]
		//h2[contains(text(),'Gaming')]
		
		//contains() with text() and with contains - attr:
		//htmltag[contains(text(),'value') and contains(attr,'value')]
		//a[contains(text(),'Customer Service') and contains(@href,'nav_cs_customerservice')]
		//htmltag[contains(text(),'value') and contains(attr1,'value') and @attr2='value']
		//a[contains(text(),'Customer Service') and contains(@href,'nav_cs_customerservice') and @data-csa-c-content-id='nav_cs_customerservice']
		
		//starts-with:
		//a[starts-with(text(),' Solutions for')]
		
		
		
		
		
		
		
		
		
	
	}

}
