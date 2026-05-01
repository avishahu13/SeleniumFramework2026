package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Basetest;
import pages.Loginpage;

public class Cntlink extends Basetest {
	
	@Test
	
	public void stringcount() throws InterruptedException {
		
		Loginpage loginpage = new Loginpage(driver);
		
		loginpage.enterUsername("Admin");
		loginpage.enterPassword("admin123");
		loginpage.presssubmitButton();
		
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement ab: links) {
			System.out.println(ab.getText());
		}
		
	}

}
