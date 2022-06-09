package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	
	//AAA - test should be written independetly
	
	
	@Test
	public void homePageTest() {
		System.out.println("HP test");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "homePageTest")
	public void searchTest() {
		System.out.println("Search test");
	}
	
	@Test(dependsOnMethods = "homePageTest")
	public void addToCartTest() {
		System.out.println("Add to cart test");
	}
	

}
