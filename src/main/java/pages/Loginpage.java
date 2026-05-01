package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	protected WebDriver driver;

	private By usernameTextbox = By.xpath("//*[@placeholder='Username']");
	private By passwordTextbox = By.xpath("//input[@placeholder='Password']");
	
	private By submitButton = By.xpath("//*[@type='submit']");

	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}

	
	
	public void enterUsername(String username) {
		driver.findElement(usernameTextbox).clear();
		//WebElement usernm = driver.findElement(usernameTextbox);
		driver.findElement(usernameTextbox).sendKeys(username);

	}

	public void enterPassword(String password) {
		driver.findElement(passwordTextbox).clear();
		driver.findElement(passwordTextbox).sendKeys(password);

	}

	public void presssubmitButton() {
		driver.findElement(submitButton).click();
	}
}