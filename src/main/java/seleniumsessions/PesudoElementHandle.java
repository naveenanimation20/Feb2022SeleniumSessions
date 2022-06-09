package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PesudoElementHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		//::before, ::after --> Pesudo CSS
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String mand_text = 
				js.
					executeScript
						("return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')")
						.toString();
						
		System.out.println(mand_text);//*
		if(mand_text.contains("*")) {
			System.out.println("PASS");
		}
	}

}
