package TestNNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class second_test_demo {
	
	WebDriver d;
	
	@Test (priority=10)
	
	void openApp()
	{
		 d= new ChromeDriver();
		 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=20)
	void login()
	{
		d.findElement(By.name("username")).sendKeys("Admin");
		d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }
	@Test(priority=30)
	void logout()
	{
		d.quit();
	}

}
