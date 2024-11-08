package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderMovement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		Actions action = new Actions(driver);	
		
		//min price pointer
		WebElement 	min_price =driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		
		System.out.println("Defalut position of the min value pointer :"+min_price.getLocation()); //(59, 289)
		//Thread.sleep(2000);
		//now move along X axis only (85 + 100) so Y axis remains constant 85 + 100
		action.dragAndDropBy(min_price, 100,232).perform();
		System.out.println("position of the min value point after moving :"+min_price.getLocation()); //(85, 232)
		Thread.sleep(5000);
		
		//max price pointer
		WebElement max_price=driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > span:nth-child(3)"));
		System.out.println("Defalut position of the max value pointer :"+max_price.getLocation());//(510, 251)
		action.dragAndDropBy(max_price, -100, 251).perform();
		System.out.println("position of the max value point after moving :"+max_price.getLocation()); 

	}

}
