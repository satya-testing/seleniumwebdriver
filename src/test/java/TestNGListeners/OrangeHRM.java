package TestNGListeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRM {

	WebDriver driver ;
	@BeforeTest	
	void setup() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
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
		Assert.assertEquals(currentURL, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/logout");
	}
	
	@Test (priority = 3, dependsOnMethods = {"testURL"})
	void testHomepageTitle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	
	@AfterClass	
	void teardown()
	{
		driver.quit();
	}
}
