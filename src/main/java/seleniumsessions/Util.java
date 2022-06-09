package seleniumsessions;

import java.net.URL;

public interface Util {
	
	String CHROME_BROWSER = "chrome";
	String FIREFOX_BROWSER = "firefox";
	String SAFARI_BROWSER = "safari";


	public void navigateUrl(String url);
	public void navigateUrl(URL url);


	public String getPageTitle();

	public String getPageUrl();

	public String getPageSource();

	public void closeBrowser();

	public void quitBrowser();

}
