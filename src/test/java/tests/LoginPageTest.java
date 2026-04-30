package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Basetest;
import pages.Loginpage;

public class LoginPageTest extends Basetest{

	
	@Test
	public void validlogin() {
	Loginpage loginpage = new Loginpage(driver);
	
	loginpage.enterUsername("Admin");
	loginpage.enterUsername("admin123");
	loginpage.presssubmitButton();
	
	String homepagetitle = driver.getTitle();
	
	Assert.assertTrue(homepagetitle.equals("OrangeHRM"));
	
	//TakesScreenshot scr = new Take
	}
	
	
	
}
