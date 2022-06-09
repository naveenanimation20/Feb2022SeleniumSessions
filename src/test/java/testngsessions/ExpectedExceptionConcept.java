package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	String name = "naveen";
	
	
	@Test(priority = 1, expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void searchProductTest() {
		System.out.println("macbook ");
		int i = 9/0;//AE
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj = null;
		System.out.println(obj.name);//NPE
		//AIOB
	}
	
	
	@Test(expectedExceptions = Exception.class)
	public void testingTest() {
		
	}
	
	
	

}
