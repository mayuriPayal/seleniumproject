package TestNNG;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parellel {
	   WebDriver d;
	
	@BeforeClass
	@Parameters({"browser"})
	
            void setup(String br) throws InterruptedException 
	{
	       if(br.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			d=new ChromeDriver();
			}
	else if(br.equals("edge"))
	{
				WebDriverManager.edgedriver().setup();
				d=new EdgeDriver();
	}
					
	else {
		WebDriverManager.firefoxdriver().setup();
		d=new FirefoxDriver();
	}
	
		    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

			d.get("https://opensource-demo.orangehrmlive.com/");
		    d.manage().window().maximize();
		   Thread.sleep(10000);
	}

	
	@Test(priority=1)
	
	void testlog()
	{
		try {
		boolean status=d.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);}
		catch(Exception e) {
		Assert.fail();
		}
	}
	
	@Test(priority=2)
	
	void testPageHometitle()
    {
		Assert.assertEquals(d.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void closeapp()
	{
		d.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
