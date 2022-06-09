package seleniumsessions;

public class WaitConcept {

	public static void main(String[] args) {

		//sync b/w script and the application
		//waits:
		//1. static wait: Thread.sleep(10000); -- 2 secs --> wait for 10 secs only
		//2. dynamic wait: max time out = 10 secs ---> ele is found in 2 secs --> 8 secs will be ignored
			//a. Implicitly Wait: only for WEs
			//b. Explicit Wait: web elements + non web elements(alert, title, url)
					//b.1: WebDriverWait
					//b.2: FluentWait
		//WebDriverWait (c) --> extends --> FluentWait(c) --> implements Wait(I)- Until();
		
	}

}
