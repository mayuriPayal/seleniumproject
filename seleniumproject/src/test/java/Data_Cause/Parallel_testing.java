package Data_Cause;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_testing {

WebDriver d;

@Test(priority=1)
@Parameters({"browser"})
void setup(String br) throws InterruptedException
{
	
	if(br.equals("chrome"))
	{
	WebDriverManager.chromedriver().setup();
	d=new ChromeDriver();
	}
	else if(br.equals("edge"))
	{
		WebDriverManager.chromedriver().setup();
		d=new EdgeDriver();
	}
	
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	d.manage().window().maximize();
	Thread.sleep(5000);
	
}
@Test(priority=2)
void search()
{
	d.findElement(By.name("password")).sendKeys("admin123");
}



	
}
