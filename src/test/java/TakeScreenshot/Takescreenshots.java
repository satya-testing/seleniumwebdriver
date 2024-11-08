package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Takescreenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//fullpage screenshot
		//wait until logo is visible	
		WebDriverWait wait =  new WebDriverWait(driver ,Duration.ofSeconds(10));		
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@alt='company-branding']"))));
				
				
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		
	/*	TakesScreenshot ts = (TakesScreenshot) driver;
		File 	sourcefile =ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"//Screenshots//fullpage_"+ timestamp +".png");
		sourcefile.renameTo(targetfile);
	
		System.out.println("Full page screenshot taken successfully");
	*/	
		//only selected area
		WebElement loginsection =driver.findElement(By.xpath("//div[@class='orangehrm-login-slot']"));
		File sourcefile =loginsection.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"//Screenshots//selectedarea_"+ timestamp +".png");
		//sourcefile.renameTo(targetfile);
			FileUtils.copyFile(sourcefile, targetfile);
		//similarly we can take screenshot for particular webelement like logos, titles....

		
	}

}
