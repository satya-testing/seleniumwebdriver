package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static void main(String[] args) throws NoSuchElementException, InterruptedException{
		
		System.out.println("Testcase 1 ");
		String actualTitle = "Your Store";
		
		
		WebDriver driver = new ChromeDriver();
		//open url
		driver.get("https://demo.opencart.com");
		//maximise the window
		driver.manage().window().maximize();
		//get the title of the page
		String currentTitle = driver.getTitle();
		//validate the title with actual title
		if(actualTitle.equals(currentTitle))
		{
			System.out.println("Title of the page is corrent : "+currentTitle);		
		}
		else {
			System.out.println("Page title is worng");
		}
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnits.SECONDS);
		//click on Desktop
	/*	WebDriverWait wait= new WebDriverWait(driver, 20);
		By item = By.linkText("Desktops");
	*/	
		driver.findElement(By.linkText("Desktops")).click();		
		driver.findElement(By.linkText("Show All Desktops")).click();
		
	}

}
