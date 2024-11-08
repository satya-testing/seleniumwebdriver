package BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url  = "http://www.deadlinkcity.com/";
		int brokenLink = 0;
		int validLink = 0;
		int redirectionLink = 0;
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println("total no. of links in a page===>"+links.size());
		for(WebElement link :links)
		{
			String href =link.getAttribute("href");
			if(href!=null && !href.isEmpty())
			{
				int responsecode = getResponseCode(href);
				System.out.println("URL :"+ href +"--->response code :"+responsecode);
				
				if(responsecode>=200 && responsecode<300)
				{
					validLink++;
				}
				else if(responsecode>=300 && responsecode<400)
				{
					brokenLink ++;
				}
				else if(responsecode>=400)
				{
					brokenLink++;
				}
			}
			
			
		}
		System.out.println("valid links :"+validLink);
		System.out.println("Broken links :"+brokenLink);
		System.out.println("redirection links :"+redirectionLink);
	}

	
	
	
	
	
	
	
	private static int getResponseCode(String link) {
		try {
		URL url = new URL(link);	
		HttpURLConnection connection =(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setConnectTimeout(5000);
		connection.connect();
		
		return connection.getResponseCode();
		} catch (Exception e) {
			System.out.println("failed to connect to server URL :"+ link);
			
			return 0;
		}
	
		
	}
}
