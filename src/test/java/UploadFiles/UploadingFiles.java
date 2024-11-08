package UploadFiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		//upload single file
		String file1 = "C:\\Users\\Satyanarayana.patil\\eclipse-workspace\\MyPrepration\\seleniumwebdriver\\Screenshots\\fullpage.png" ;
		
		driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys(file1);
		
		//upload  more then 2 files
	/*	
		String file1 ="";
		String file2 ="";
		
		driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys(file1+"\n"+file2);
	*/	
	}

}
