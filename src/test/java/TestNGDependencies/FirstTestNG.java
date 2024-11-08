package TestNGDependencies;

import org.testng.annotations.Test;

public class FirstTestNG {
	//Test cases
	//1.open app
	//2.login
	//3.logout
	
	@Test(priority = 1)
	void openApp()
	{
		System.out.println("app is launched...");
	}
	
	@Test(priority = 2)
	void login()
	{
		System.out.println("logged in successful...");
	}
	
	@Test(priority = 3)	
	void logout()
	{
		System.out.println("logged-out successfully");
	}
	
}
