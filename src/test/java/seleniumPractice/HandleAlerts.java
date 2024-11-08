package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
	//normal alerts only one button
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
	Thread.sleep(4000);
		Alert  normalAlert = driver.switchTo().alert();
		System.out.println(normalAlert.getText());
		normalAlert.accept();
		
		
	//confimation alert having OK and Cancel buttons
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Alert confirmAlert = driver.switchTo().alert();
		System.out.println(confirmAlert.getText());
	//	confirmAlert.accept();
		confirmAlert.dismiss();
		
	//prompt alerts with input box
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		promptAlert.sendKeys("Satya");
		promptAlert.accept();
	}

}
