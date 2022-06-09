package testngsessions;

import org.testng.annotations.Test;

public class PriorityBasedTC {

	@Test(priority = 2)
	public void aTest() {
		System.out.println("A test");
	}

	@Test(enabled = false, priority = 1)
	public void bTest() {
		System.out.println("B test");
	}

	@Test(priority = 3)
	public void cTest() {
		System.out.println("C test");
	}

	@Test(priority = 50)
	public void dTest() {
		System.out.println("D test");
	}

	@Test(priority = 51)
	public void eTest() {
		System.out.println("E test");
	}

}
