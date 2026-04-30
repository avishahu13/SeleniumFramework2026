import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Firsttest {

	
	@Test
	public void loginwithvalidid() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().fullscreen();		
		WebElement id = driver.findElement(By.xpath("//*[@placeholder='Username']"));
		WebElement pw = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		
		id.sendKeys("Admin");
		pw.sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.quit();		
	}
	
}
