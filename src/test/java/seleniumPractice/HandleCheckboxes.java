package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//select single checkbox
	//	driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//select all checkbox at a time
		List<WebElement> checkboxes =  driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
			System.out.println(checkboxes.size());
		
	/*	for(int i=0;i<checkboxes.size();i++ )
		{
			checkboxes.get(i).click();
		}
	*/	
		for(WebElement clickBox : checkboxes)
		{
			clickBox.click();
		}
			
	}

}
