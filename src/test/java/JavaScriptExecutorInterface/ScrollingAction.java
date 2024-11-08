package JavaScriptExecutorInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	/*	//1.scroll down the page based on pixel number
		js.executeScript("window.scrollBy(0,1500)", "");
		System.out.println(js.executeScript("return window.pageYOffset")); //1500
		
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='comboBox']"));
		// 	2.scroll down the page till find the element is reach
		js.executeScript("arguments[0].scrollIntoView()", ele);
		System.out.println(js.executeScript("return window.pageYOffset")); //2288.666748046875
	*/	
		//3.scroll down the page till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		//4. scroll back to top of the page
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
	}

}
