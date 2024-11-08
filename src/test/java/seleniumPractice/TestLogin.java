package seleniumPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLogin {

	WebDriver driver;	
		
	public void setUp() {
		driver = new ChromeDriver();			
	}
	
	public void launchUrl() throws InterruptedException {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("navigated to the url");
	//	Thread.sleep(5000);
	}
	
	public void Login() throws NoSuchElementException {	
		//explicit wait
		System.out.println("explicit waiting ");
		WebDriverWait myWait = new WebDriverWait(driver , Duration.ofSeconds(10));
		WebElement userNameBox = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']"))) ;
		userNameBox.sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		System.out.println("logged in successfull");
		
		
		
		
		
		
		
	/*	if(driver.findElement(By.xpath("//input[@placeholder='Username']")).isEnabled())
		{
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");	
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
			driver.findElement(By.cssSelector("button[type='submit']")).click();
			System.out.println("logged in successfull");
		}else {
			System.out.println("Page is not loaded fully");
		}
	*/
		
		
/*		textUsername.sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
*/		
//	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[normalize-space()='Upgrade']")).click();
		// collect all window ids
		Set<String> windowIDs=driver.getWindowHandles();	
		
		//convert to List and store the ids
		List<String> windowList =new ArrayList<String>(windowIDs);
		String parentwindow =windowList.get(0);
		String childwindow = windowList.get(1);
		
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
		//we can also user for each loop if there are so many windows
		//for(String windid : windowIDs)
	}
	
	public void tearDown() {
		driver.quit();
		System.out.println("Browser closed");
	}
	
	
}
	