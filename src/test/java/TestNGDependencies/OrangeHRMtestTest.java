package TestNGDependencies;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

		//1.go to url
		//2.validate the logo
		//3.login
		//4.close the browser
	
		
public class OrangeHRMtestTest {
	WebDriver driver ;
	
  @Test(priority= 1)
  public void orageHRMsite() {
	  driver = new ChromeDriver();	
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  
  }
  
  
  @Test(priority= 2)
  public void logoTest() throws InterruptedException {
	  Thread.sleep(3000);
	 boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	 System.out.println("webpage logo is :"+logo);
  }
  
  @Test(priority= 3)
  public void loginTest() {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).click();
  }
  
  @Test (priority= 4)
  public void closeBrowser() {
	  driver.close();
  }
}
