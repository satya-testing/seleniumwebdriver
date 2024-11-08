package ExcelUtilityPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		
		String filepath =System.getProperty("user.dir")+"\\Utils\\FDCalculations.xlsx";
		
		//get rowcount
		int rows =ExcelUtils.getRowCount(filepath, "cals");
		
		for(int i=1; i<=rows; i++)
		{
			//read data from excel
			String principle= ExcelUtils.getcelldata(filepath, "cals", i, 0);
			String roi= ExcelUtils.getcelldata(filepath, "cals", i, 1);
			String period1= ExcelUtils.getcelldata(filepath, "cals", i, 2);
			String period2= ExcelUtils.getcelldata(filepath, "cals", i, 3);
			String freq= ExcelUtils.getcelldata(filepath, "cals", i, 4);
			String ex_mValue= ExcelUtils.getcelldata(filepath, "cals", i, 5);

			
			//pass above data into application
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principle);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(roi);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);
			Select select = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));	
			select.selectByVisibleText(period2);
			
			Select feqselect = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			feqselect.selectByVisibleText(freq);
			//driver.switchTo().alert();
			// driver.findElement(By.xpath("//button[@class='No thanks']")).click();
			
			driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
			
			//validate the data 
			String act_mValue = driver.findElement(By.xpath("//span[@id ='resp_matval']//strong")).getText();			
			double expected = Double.parseDouble(ex_mValue);
			double actual = Double.parseDouble(act_mValue);
			
			if(actual == expected)
			{
				System.out.println("Test case pass");
				ExcelUtils.setcelldata(filepath, "cals", i, 7, "PASS");
			}else
			{
				System.out.println("Test case failed");
				ExcelUtils.setcelldata(filepath, "cals", i, 7, "FAIL");
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
		}
		
	}

}
