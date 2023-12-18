package TestNNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {
	
	WebDriver d;
	
	@BeforeClass
	
	void setup()
	{
		d=new ChromeDriver();
		
	}
	
	@Test(dataProvider="dp")
	
	void testlogin(String email,String pwd)
	{
		d.get("https://demo.nopcommerce.com/login");
		d.manage().window().maximize();
		d.findElement(By.id("Email")).sendKeys(email);
		d.findElement(By.id("Password")).sendKeys(pwd);
		d.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

		String exp_title = "nopCommerce demo store";
		String act_title = d.getTitle();

		Assert.assertEquals(exp_title, act_title);
	}
	
	
	@AfterClass
	void teardown()
	{
		d.quit();
	}
	
	
	@DataProvider(name="dp",indices= {0,1,4})
	
	String [][] logindata()
	{
		String data[][]	={ { "abc@gmail.com", "test123" }, 
			{ "pavanol@gmail.com", "test@123" },
			{ "pavanoltraining@gmail.com", "test3" },
			{ "pavanoltraining@gmail.com", "test@123" },
			{ "mayurisatpute9@gmail.com", "mayu@123" } };
	return data;
	
	}
}
