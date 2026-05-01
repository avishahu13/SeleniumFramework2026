package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Basetest;
import pages.Loginpage;
import utils.ExtentReportManager;
import utils.Log;

public class LoginPageTest extends Basetest{

	
	@Test
	public void validlogin() {
		test = ExtentReportManager.createTest("Login with valid id");
	Loginpage loginpage = new Loginpage(driver);
	test.info("Entering uername");
	Log.info("Entering username");
	test.info("Entering pw");
	loginpage.enterUsername("Admin");
	Log.info("enering pssword");
	
	loginpage.enterUsername("admin123");
	test.info("Pressing enter");
	loginpage.presssubmitButton();
	
	String homepagetitle = driver.getTitle();
	
	
	Assert.assertTrue(homepagetitle.equals("OrangeHRM"));
	Log.info("Login Successfull");
	test.pass("test successfull");
	//TakesScreenshot scr = new Take
	}
	
	@Test
	public void invalidlogin() {
		test = ExtentReportManager.createTest("Login with invalid id");
	Loginpage loginpage = new Loginpage(driver);
	test.info("Entering uername");
	Log.info("Entering username");
	test.info("Entering pw");
	loginpage.enterUsername("Admin1");
	Log.info("enering pssword");
	
	loginpage.enterUsername("admin1234");
	test.info("Pressing enter");
	loginpage.presssubmitButton();
	
	
	String homepagetitle = driver.getTitle();
	
	
	//Assert.assertTrue(homepagetitle.equals("OrangeHRM"));
	
	if(homepagetitle.equals("OrangeHRM"))
	{
		test.fail("Test fail");
	}
	else {
		test.pass("Test pass");
	}
	//Log.info("Login Successfull");
	
	
	}
	
	
	
}
