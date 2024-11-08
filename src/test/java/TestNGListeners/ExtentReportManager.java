package TestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener	{
	
	public ExtentSparkReporter 	sparkReporter ;	
	public ExtentReports extent ;
	public ExtentTest test;	
	
	public void onStart(ITestContext context) {
		// Date d = new Date();	
		// String filename = "Extent_"+d.toString().replace(":", "").replace(" ", "")+".html";
		//set the location where you want to save with file name
	   sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/myreport.html");
	   //set Title of the report
	   sparkReporter.config().setDocumentTitle("Automation Report");
	   // set name of the report
	   sparkReporter.config().setReportName("Functional Testing");
	   // set theme 
	   sparkReporter.config().setTheme(Theme.DARK);
	   
	   extent = new ExtentReports();
	   //now link sparkReport and extent
	   extent.attachReporter(sparkReporter);
	   
	   //test artifact details
	   extent.setSystemInfo("Computer name", "localhost");
	   extent.setSystemInfo("Test Environment", "Beta");
	   extent.setSystemInfo("OS", "Windows 10");
	   extent.setSystemInfo("Browser name", "Chrome");
	   extent.setSystemInfo("Tester name", "Satya");
	   
	  }
	
	
		
	
	public void onTestSuccess(ITestResult result) {
	   // System.out.println("Test method success....");
		test =extent.createTest(result.getName());
		test.log(Status.PASS, "Test case Passed :"+result.getName());
	  }
	
	public void onTestFailure(ITestResult result) {
	   // System.out.println("Test method failed....");
		test =extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case Failed :"+result.getName());
	  }
	
	public void onTestSkipped(ITestResult result) {
	    //System.out.println("Test method skipped....");
		test =extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case Skipped :"+result.getName());
	  }
	
	public void onFinish(ITestContext context) {
	    extent.flush();
	  }
	
	
}
