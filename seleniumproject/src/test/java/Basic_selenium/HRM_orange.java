package Basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM_orange {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
                                             
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		/*String actual_title=driver.getTitle();
		String accepted_title="OrangeHM";

if(actual_title.equals(accepted_title))
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}*/
		String actual_title ="";
		try {
	 actual_title = driver.findElement(By.xpath("//header/div[1]/div[1]/span[1]/h6[1]")).getText();
	}
	catch(NoSuchElementException e)	{
		
	}
	String accepted_title="Dashboard";
	if(actual_title.equals(accepted_title))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("test failed");
	}
	
	
	driver.quit();
	}

}
