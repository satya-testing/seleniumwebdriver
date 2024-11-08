package TestNGparameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassing {
	
	WebDriver driver ;
	@BeforeClass	
	@Parameters ({"browser"})	
	void setup(String ba) throws InterruptedException
	{	
		switch(ba.toLowerCase())
		{
		case "chrome" : driver = new ChromeDriver();
		break;
		case "edge" : driver = new EdgeDriver();
		break;
		case "firefox" : driver = new  FirefoxDriver();
		break;
		default : System.out.println("invalid broswer name");
		return;
		}
			
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test (priority = 1)
	void testLogo() throws InterruptedException
	{
		
		boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		
		Assert.assertEquals(logo, true);
	}
	
	@Test	(priority = 2)
	void testURL()
	{
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@AfterClass	
	void teardown()
	{
		driver.quit();
	}

}
