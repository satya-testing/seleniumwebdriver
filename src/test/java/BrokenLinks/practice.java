package BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int validLinks = 0;
		int brokenLinks = 0;
		int failedLinks = 0;
		int redirectionLinks = 0;
		String url = "http://www.deadlinkcity.com/";
						
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		
		for( WebElement link :links)
		{
			String href = link.getAttribute("href");
			try {
			if(href!=null && !href.isEmpty())
			{
				URL urls = new URL(href);
				HttpURLConnection connection =(HttpURLConnection) urls.openConnection();
				connection.setRequestMethod("GET");
				connection.setConnectTimeout(5000);
				connection.connect();
				
				int responseCode=connection.getResponseCode();
				if(responseCode>=200 && responseCode<300)
				{
					System.out.println("URL:"+ href +" --->response code is :"+responseCode);
					validLinks ++;
				}
				else if(responseCode>=300 && responseCode<400){
					System.out.println("URL:"+ href +" --->response code is :"+responseCode);
					redirectionLinks ++;
				}
				else if(responseCode>=400 ) {
					System.out.println("URL:"+ href +" --->response code is :"+responseCode);
					brokenLinks ++;
				}						
			}
		}
			catch(Exception e)
			{
				System.out.println("URL:"+ href +"failed to connect to the url");
				failedLinks ++;
			}
	}	
		System.out.println("total number of links in page :"+links.size());
		System.out.println("total valid link :"+validLinks);
		System.out.println("total broken link :"+brokenLinks);
		System.out.println("total redirection link :"+redirectionLinks);
		System.out.println("total faild link :"+failedLinks);

}
}