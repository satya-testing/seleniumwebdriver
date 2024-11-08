package seleniumPractice;

import org.openqa.selenium.WebDriver;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		TestLogin test1 = new TestLogin();
		test1.setUp();
		test1.launchUrl();
		test1.Login();
		
		//test1.tearDown();
		
	}

}
