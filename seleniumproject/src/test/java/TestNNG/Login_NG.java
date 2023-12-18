package TestNNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_NG {
	
	
	WebDriver d;
	
	@Test(priority=1)
	void openapp()
	{
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test(priority=2)
	void login()
	{
		
		d.findElement(By.name("username")).sendKeys("Admin");
		d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}	
	@Test(priority=3)
		void logout()
		{
			d.quit();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
