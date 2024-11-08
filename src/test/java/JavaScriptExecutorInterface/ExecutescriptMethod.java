package JavaScriptExecutorInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutescriptMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//using JS for sending txt to the box instead for sendKeys("satya")
		WebElement txtbox_Name=driver.findElement(By.xpath("//input[@id='name']"));
		
// Sending Text to a Disabled or Hidden Input Field
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','satya')", txtbox_Name);
		
		//1. Clicking Hidden Elements
		//click action using Js
		WebElement btn_gender =driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", btn_gender);
		
		
	}

}


/*Get a Cookie:
String cookieValue = (String) js.executeScript("return document.cookie;");

Set a Cookie:
js.executeScript("document.cookie='username=JohnDoe';");

Get Page Title:
String title = (String) js.executeScript("return document.title;");

*/