package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		
		//enter the text in text area
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcomen to the new world");
		
		Actions action = new Actions(driver);
		
		//Ctrl+A - to select all
		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//Ctrl+c  -to copy the text
		action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

		//press TAB key to jump to next text area
		action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//Ctrl+V  - to past the text
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		
	//Ctrl+Shift+A
		//action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
	}

}
	
//Also we can user robot class
/*  Robot robot = new Robot();

// Type Username
robot.keyPress(KeyEvent.VK_U);
robot.keyRelease(KeyEvent.VK_U);
robot.keyPress(KeyEvent.VK_S);
robot.keyRelease(KeyEvent.VK_S);
robot.keyPress(KeyEvent.VK_E);
robot.keyRelease(KeyEvent.VK_E);
robot.keyPress(KeyEvent.VK_R);
robot.keyRelease(KeyEvent.VK_R);

// Press Tab to move to the password field
robot.keyPress(KeyEvent.VK_TAB);
robot.keyRelease(KeyEvent.VK_TAB);

// Type Password
robot.keyPress(KeyEvent.VK_P);
robot.keyRelease(KeyEvent.VK_P);
robot.keyPress(KeyEvent.VK_A);
robot.keyRelease(KeyEvent.VK_A);
robot.keyPress(KeyEvent.VK_S);
robot.keyRelease(KeyEvent.VK_S);
robot.keyPress(KeyEvent.VK_S);
robot.keyRelease(KeyEvent.VK_S);

// Press Enter to submit
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);    */