package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

public class AmazonTest {

	public static void main(String[] args) throws MalformedURLException {

		BrowserUtil brUtil = new BrowserUtil();
		brUtil.init_driver("safari");
		
		
		//brUtil.navigateUrl("https://www.amazon.com");
		brUtil.navigateUrl(new URL("https://www.amazon.com"));
		
		
		String actTitle = brUtil.getPageTitle();
		System.out.println("title is : " + actTitle);
		
			if(actTitle.contains("Amazon")) {
				System.out.println("correct title");
			}
			else {
				System.out.println("incorrect title");
			}
			
		System.out.println(brUtil.getPageSource().contains("Actionable Analytics"));
		System.out.println(brUtil.getPageUrl().contains("https://www.amazon.com/"));
		
		//brUtil.closeBrowser();
		
	}

}
