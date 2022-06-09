package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		//css : is not an attribute
		
		//id -> #id
		//class --> .classname
		
		// #input-email
		// input#input-email
		// .form-control
		// input.action
		
		By.cssSelector("#input-email");
		
		//tagname.classname#id
		//input.action#Form_submitForm_action_request
		//tagname#id.classname
		//input#Form_submitForm_action_request.action
		//#id.classname
		//#Form_submitForm_action_request.action
		//.classname#id
		//.action#Form_submitForm_action_request
		
		//css using attr name:
		// tag[attr='value']
		// input[type='submit']
		// input[type='submit'][value='Submit'][name='action_request']
		
		//multiple classes:
		// .c1.c2.c3....cn
		// tag.c1.c2.c3....cn
		// table.ds-w-full.ds-table.ds-table-xs.ds-table-fixed.ci-scorecard-table
		// table.ci-scorecard-table
		
		By.className("ds-w-full ds-table ds-table-xs ds-table-fixed ci-scorecard-table");//wrong
		By.xpath("//table[@class='ds-w-full ds-table ds-table-xs ds-table-fixed ci-scorecard-table']");//correct
		By.cssSelector("table.ds-w-full.ds-table.ds-table-xs.ds-table-fixed.ci-scorecard-table");//correct
		
		By.className("login-email");
		By.xpath("//input[@class='form-control private-form__control login-email']");
		By.xpath("//input[contains(@class,'login-email')]");
		By.cssSelector("input.form-control.private-form__control.login-email");
		By.cssSelector("input.login-email");
		
		//
		// input[class*='login-email']
		// input[id*='name'] --contains
		// input[id^='user'] --starts-with
		// input[id$='name'] -- ends-with
		
		//parent to child:
		// div.private-form__input-wrapper > input#username ---> only direct child elements -- 1
		
		// form#loginForm > input --- 0 (only direct child elements)
		// form#loginForm  input -- 3 (direct + indirect child elements)
		
		//div.page  div -- 24
		//div.page > div -- 2
		
		//child to parent: NA (Backward Traversing is not allowed using CSS)
		
		//sibling in css:
		// div.password-input + div
		
		// ul.footer-nav > li:nth-of-type(2) -- specific index
		// ul.footer-nav > li:nth-of-type(n) -- all values
		
		//comma in css:
		// input#Form_submitForm_Name, input[name='Email'], select.dropdown.countries, input[name='action_request']
		List<WebElement> mand_eles = driver.findElements(By.cssSelector("input#Form_submitForm_Name, "
				+ "input[name='Email'], "
				+ "select.dropdown.countries, "
				+ "input[name='action_request']"));
		
		System.out.println(mand_eles.size());
		
		//                 xpath        vs       css
		//1. syntax:       complex                simple
		//2. performance:    good                  good
		//3. backward:        yes                   NO
		//4. siblings:        yes                   immediate forward siling only
		//5. ancestor:        yes                   NO
		//6. comma:           NO					Yes
		//7. index:           better				nth-of-type with limited options
		//8. webtable:        better handling			not much options available
		//9. SVG elements:     yes						NA
		//10. shadow dom       NA						yes	
		
		
		//11. Relative Locators: 
		
		
		
		

	}

}
