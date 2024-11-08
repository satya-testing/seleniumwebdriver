package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		
		//1.Launch chrome browser
		//2.Open url https://demo.opencart.com//
		//validate title should be "Your Store"
		//4.close browser
		
		
		System.out.println("Testcase 1 ");
		String actualTitle = "Your Store";
		
		//ChromeDriver driver = new ChromeDriver();
		//Launch browser
		//WebDriver driver = new ChromeDriver();
		//Edge browser launch
		WebDriver driver = new EdgeDriver();
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
		
		//close the browser
		//driver.close();
		//driver.quit();
	}

}
