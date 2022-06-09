package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

//testng/junit: java unit test fw -- TDD
//pytest/unittest: python
//Mocha, Jasmine: JS
//.net: Nunit

public class GoogleTest extends BaseTest{

	@Test(priority = 1)
	public void googleTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Google");
	}

	@Test(priority = 2)
	public void googleUrlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
	}
	
	
	//CRUD
	//create a user: 123
	//update the user --> create user --> user id(123) --> update user -- check user is updated
	//delete user --> create user --> user id --> delete user -> user is deleted?
	//get the user--> create user --> user id --> get the user
	
	

}
