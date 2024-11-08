package TestNGDependencies;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {


	
	@Test(priority = 1)
	void openApp()
	{
	
		Assert.assertTrue(true);
		
		//System.out.println("app is launched...");
	}
	
	@Test(priority = 2, dependsOnMethods={"openApp"})	
	void login()
	{
		System.out.println("logged in successful...");
	}
		
	@Test(priority =3, dependsOnMethods={"login"})	
	void search()
	{
		System.out.println("search for product");
	}
	
	@Test(priority = 4, dependsOnMethods={"login"})	
	void logout()
	{
		System.out.println("logged-out successfully");
	}
	
	
	
}
