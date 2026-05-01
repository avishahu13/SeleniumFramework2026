package tests;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Basetest;
import pages.Loginpage;

public class TakeScreenshot extends Basetest {
	
	@Test
	
	public void takeSS() {
		
		Loginpage loginpage = new Loginpage(driver);
		
		loginpage.enterUsername("Admin");
		
		//Take full screen SS
		TakesScreenshot ss = (TakesScreenshot)driver; // 
		File scr  = ss.getScreenshotAs(OutputType.FILE);
		File trg = new File(System.getProperty("user.dir")+"\\screenshots\\ss.png");
		scr.renameTo(trg); //copy src file to destination
		
		WebElement usernm = driver.findElement(By.xpath("//*[@placeholder='Username']"));
		//Take element of SS
		File src1 = usernm.getScreenshotAs(OutputType.FILE);
		File trg2 = new File(System.getProperty("ser.dir")+"\\screenshots\\elementss.png");
		src1.renameTo(trg2);
	}

}
