package ActionsClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/demo");
		System.out.println("title of the main page :"+driver.getTitle());
		WebElement partnerMenu = driver.findElement(By.xpath("//span[normalize-space()='Partners']"));
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).click(partnerMenu).keyUp(Keys.CONTROL).perform();
		
		//switch to the next window
		List<String> ids = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(ids.get(1));
		System.out.println("title of the 2nd page :"+driver.getTitle());
		
	}

}
