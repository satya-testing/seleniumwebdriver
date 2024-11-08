package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		
	//1.XPath with single attribute
	//	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("single attri");
		
	//2.Xpath with multiple attributes
	//	driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Multiple attri");
		
		
	//3.Xapth with and/or operator
		// A and B ---both A & B should be true
		// A or B ---either A/ B should be ture
		//And
	//	driver.findElement(By.xpath("//input[@name='search'and @placeholder='Search']")).sendKeys("And");
		//or
	//	driver.findElement(By.xpath("//input[@name='search'or @placeholder='Search']")).sendKeys("OR");
		 
	//4.Xpath with inner text - text()    //use only when inner text is present
	//	driver.findElement(By.xpath("//a[text()='Desktops']")).click();
		
	//5.contains xpath
	//	 driver.findElement(By.xpath("//input[contains(@placeholder.'Sea')]")).sendKeys("contains xpath");
	//6.starts-with
	//	 driver.findElement(By.xpath("//input[starts-with(@placeholder.'Sea')]")).sendKeys("contains xpath");
	//7.chained xpath (combination of relative absalute xpaths)
		// ("//div[@id='logo']/a/img")
	
		
		//Xpath axes
		
		//1.Locating a Parent element
		//syntax - //<knownXpath>/parent::<Parent tagname>   or //<knownXpath>/parent::*
		//ex: //input[@class="Username"]/parent::form
		
		//2.Locating a Child element
		//syntax - //<pathOfContaxtElement>/child::<elementName>   or  //<pathOfContaxtElement>/child::*
		//ex  -  //div[@id="divusername"]/child::input           //this kind of xpath is user to find the element whose attributes are not present
		
		
		//3.Locating grand parent and grand children 
		//Syntax  - <xpathOfCOntextElement>/ancestor::<elementName>    or <xpathOfCOntextElement>/ancestor::*
		//ex  - //input[@class="Username"]/ancestor::form     //grand parent or ancestor
		
		//ex - //form[@id="fromLogin"]/descendant::input      //grand child or descendant		
		// or //form[@id="fromLogin"]//input       // '//' directly jump to the tag like inbetween ignore all the tags
		
		
		//4.following elements    following elemtent and preceding elements
		
		//ex - //input[@id="username"]/following::input 
			//if there are more grand child (input tags) are present then we need to mention the index
			////input[@id="username"]/following::input[2]  or or   
		//		or 	//input[@id="username"]/following::input[last()] 
		//				or //input[@id="username"]/following::input[first[])
		
		//if there are more grand child (input tags) are present then we need to mention the index
		////input[@id="username"]/preceding::input[2]  or or   
	//		or 	//input[@id="username"]/preceding::input[last()] 
	//				or //input[@id="username"]/preceding::input[first[])
		
		//5.following-sibling  and preceding-sibling
		////input[@id="username"]/following-sibling::span  or *
		////input[@id="username"]/preceding-sibling::span  or *
	}	

}
 