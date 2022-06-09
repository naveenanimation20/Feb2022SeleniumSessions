package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CriciInfoWebTable {
	
	static WebDriver driver;

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/county-championship-division-two-2022-1310355/nottinghamshire-vs-worcestershire-1297692/full-scorecard");
		
		System.out.println(getWicketTakerName("Azhar Ali"));
		System.out.println(getPlayerScoreList("Azhar Ali"));

		System.out.println(getWicketTakerName("Ed Pollock"));
		System.out.println(getPlayerScoreList("Ed Pollock"));


	}
	
	public static List<String> getPlayerScoreList(String playerName) {
		System.out.println("player name : " + playerName);
		String sc_xpath = "//table[contains(@class,'ci-scorecard-table')]//span[contains(text(),'"+playerName+"')]/ancestor::td/following-sibling::td";
		List<WebElement> scoreList = driver.findElements(By.xpath(sc_xpath));
		List<String> scoreValIst = new ArrayList<String>();
		for(WebElement e : scoreList) {
			String text = e.getText();
			scoreValIst.add(text);
		}
		return scoreValIst;
	}
	
	public static String getWicketTakerName(String playerName) {
		String wk_xpath = "//span[contains(text(),'"+playerName+"')]/ancestor::td/following-sibling::td";
		return driver.findElement(By.xpath(wk_xpath)).getText();
	}
	
	

}
