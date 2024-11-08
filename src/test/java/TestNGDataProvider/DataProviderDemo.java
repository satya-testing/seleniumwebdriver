package TestNGDataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver ;
	@BeforeClass	
	void setup()
	{
		 driver = new ChromeDriver();	
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test (dataProvider = "creds")	
	void testLogin(String email, String pwd) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		boolean logo = driver.findElement(By.xpath("//a[normalize-space()='Qafox.com']")).isDisplayed();
		if(logo==true )
		{
			driver.findElement(By.xpath("(//a[@class='list-group-item'][normalize-space()='Logout'])[1]")).click();
			Assert.assertTrue(true);
			
		}else
		{
			Assert.fail();
		}
		
	}
	
	@AfterClass	 
	void teardown()
	{
		driver.close();
	}
	
	@DataProvider (name = "creds")
	Object [][] logindata()
	{
		Object data[][] = {
			{"abc@gmail.com","test123"},
			{"apples@dfsf.com", "saenj123"},
			{"satyareddy@gmail.com", "Test@123"},
			{"satya@gmail.com", "Test@1234"}
		};
		
		return data;
	}

}
