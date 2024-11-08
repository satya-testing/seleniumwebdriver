package BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {
	
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links in page :"+allLinks.size());
		
		int noOfBrokenLinks = 0;
		int noOfvalidLinks = 0;
		int redirectionLinks = 0;
		int failedconnection = 0;
		
		for(WebElement link:allLinks)
		{
			String hrefvalue =link.getAttribute("href");
			
			//verify value is null or empty then not possible to check the broken link
			if(hrefvalue==null || hrefvalue.isEmpty())
			{
				System.out.println("hrefvalue is empty or Null. so, not possible to check this link");			
				continue;
			}
			
			//hit url to server to get the response code
			//before that convert string url to URL format 
			try {
			URL linkURL = new URL(hrefvalue); //convert href value from string to url format
			HttpURLConnection connection = (HttpURLConnection) linkURL.openConnection(); // open connection to the server
			connection.setConnectTimeout(5000); //timeout
			connection.connect(); //connect to the server and sent request the server
			
			
			if(connection.getResponseCode()>=400)
			{
				System.out.println("URL:"+ hrefvalue +"response code is :"+connection.getResponseCode());
				noOfBrokenLinks++;
			}
			else if(connection.getResponseCode()>=300 && connection.getResponseCode()<400){
					System.out.println("URL:"+ hrefvalue +"===>This is redirction link");
					redirectionLinks ++;
			}
			else {
				System.out.println(hrefvalue+"response code is :"+connection.getResponseCode());
				noOfvalidLinks++ ;
			}
			
		}catch(Exception e) 
		{
			System.out.println("Failed to connect to URL: "+hrefvalue);
			failedconnection ++;
			
		}
		
		
	}
		System.out.println("total number of broken link===>"+noOfBrokenLinks);
		System.out.println("total number of valid link===>"+noOfvalidLinks);
	//	System.out.println("total number of empty/Null href===>"+emptyHref);
		System.out.println("total numner of redirecation links ====>"+redirectionLinks);
		System.out.println("total numner of failed connection links ====>"+failedconnection);
		
}
}
