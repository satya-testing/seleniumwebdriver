package TestNGgrouping;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class signuptest {
	
	@Test	(priority=1,groups= {"regression"})
	void signupToFB()
	{
		System.out.println("this is sign up to FB...");
	}
	
	
	@Test	(priority=1,groups= {"regression"})
	void signupToTwitter()
	{
		System.out.println("this is sign up to Twitter...");
	}
	
	
	@Test	(priority=1,groups= {"regression"})
	void signupToInsta()
	{
		System.out.println("this is sign up to Intagram...");
	}
}
