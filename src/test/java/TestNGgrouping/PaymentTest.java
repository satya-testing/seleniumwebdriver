package TestNGgrouping;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class PaymentTest {
	
	
	@Test	(priority=3,groups= {"sanity","regression","functional"})
	void paymentTestFB()
	{
		System.out.println("this is Payment test of FB...");
	}
	
	
	@Test	(priority=3,groups= {"sanity","regression","functional"})
	void paymentTestTwitter()
	{
		System.out.println("this is Payment test of Twitter...");
	}
	
	
	@Test	(priority=3,groups= {"sanity","regression","functional"})
	void paymentTestInsta()
	{
		System.out.println("this is Payment test of Intagram...");
	}
}
