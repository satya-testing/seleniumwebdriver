package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		WebElement 	desktops =driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));		
		WebElement mac =driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions action = new Actions(driver);			
		//method chaining if mouse hover to 2 elements
		action.moveToElement(desktops).moveToElement(mac).click().perform();
		
		
	}

}
