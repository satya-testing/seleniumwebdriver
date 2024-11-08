package BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pract {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		
		int validlinks =0;
		int redirctionlinks =0;
		int brokenlinks =0;
		
		List<WebElement> 	links = driver.findElements(By.tagName("a"));
		
		for( WebElement link:links)
		{
			String href=link.getAttribute("href");
			
			if(href!=null && !href.isEmpty())
			try{	
			{
				URL url = new URL(href);
				HttpURLConnection connection=(HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				connection.setConnectTimeout(5000);
				connection.connect();
				
				int responsecodes = connection.getResponseCode();
				if(responsecodes>=200 && responsecodes<300)
				{
					System.out.println(href+" :" +responsecodes);
					validlinks++;
				}
				else if(responsecodes>=300 && responsecodes<400)
				{
					System.out.println(href+" :" +responsecodes);
					redirctionlinks++;
				}
				else if(responsecodes>=400)
				{
					System.out.println(href+" :" +responsecodes);
					brokenlinks++;
				}
			}
			}
			catch(Exception e)
			{
				System.out.println("URL "+ href +"is failed to connect");
			}
		}
		System.out.println("total num of links :"+links.size());
		System.out.println("total num of redirection links :"+redirctionlinks);
		System.out.println("total num of valid links :"+validlinks);
		System.out.println("total num of broken links :"+brokenlinks);
	}

}
