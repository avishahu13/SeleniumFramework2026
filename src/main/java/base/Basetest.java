package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.ExtentReportManager;
import utils.Log;

public class Basetest {

	protected WebDriver driver;
	
	protected static ExtentReports extent;
	protected static ExtentTest test;
	
	@BeforeSuite
	public void setupReport() {
		extent = ExtentReportManager.getReportInstance();
	}
	
	@AfterSuite
	public void teardownReport() {
		extent.flush();
	}
	
	@BeforeMethod
	public void setup() {
		Log.info("setting up browser");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		Log.info("Navigting to est url");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	
	
	
	@AfterMethod
	public void teardown(ITestResult result) {
		
//		if(result.getStatus() == ITestResult.FAILURE) {
//			String screenshotpath = 
//		}
		
		if(driver !=null)
		driver.quit();
	}
	
}
