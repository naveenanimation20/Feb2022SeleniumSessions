package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {

	// global pre condition
	// login page pre condition
	// create a user test steps + act vs exp result
	// logout
	// close browser
	
	/*
	 *  BS -- connect wtih db
		BT -- create user
        BC -- launch browser

				BM -- login to app
				hp - title test - @test
				AM - user is logged out
				
				BM -- login to app
				hp - url test - @test
				AM - user is logged out
				
				BM -- login to app
				user logged in test - @test
				AM - user is logged out

		AC - close browser
		AT - delete user
		AS - disconnect with DB
	 */

	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS -- connect wtih db");
	}

	@BeforeTest
	public void createUser() {
		System.out.println("BT -- create user");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launch browser");
	}

	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM -- login to app");
	}

	@Test
	public void homePageTitleTest() {
		System.out.println("hp - title test");
	}

	@Test
	public void homePageUrlTest() {
		System.out.println("hp - url test");
	}

	@Test
	public void isUserLoggedInTest() {
		System.out.println("user logged in test");
	}

	@AfterMethod
	public void logout() {
		System.out.println("AM - user is logged out");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC - close browser");
	}

	@AfterTest
	public void deleteUser() {
		System.out.println("AT - delete user");
	}

	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS - disconnect with DB");
	}
	


}
