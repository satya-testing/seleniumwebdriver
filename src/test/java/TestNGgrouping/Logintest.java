package TestNGgrouping;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Logintest {

	@Test(priority =2,groups= {"sanity"})	
	void loginByFB()
	{
		System.out.println("This is login to FB....");
	}
	
	@Test(priority =2,groups= {"sanity"})	
	void loginByTwitter()
	{
		System.out.println("This is login to Twitter....");
	}
	
	@Test(priority =2,groups= {"sanity"})	
	void loginByInsta()
	{
		System.out.println("This is login to Instagram....");
	}
}
