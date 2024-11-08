package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String username = "admin";
		String password = "admin";
		String myurl = "https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth" ;
				
		//Authentication popups	
		WebDriver driver = new ChromeDriver();
		driver.get(myurl);
	//	driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
	}

}
