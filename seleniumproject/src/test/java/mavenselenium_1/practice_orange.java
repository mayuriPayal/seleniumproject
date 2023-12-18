package mavenselenium_1;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_orange {

	public static void main(String[] args) throws InterruptedException {

		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");

		driver.findElement(By.name("password")).sendKeys("admin12");
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		Thread.sleep(5000);
		
	//	String act_title=driver.getTitle();
	//	String accpt_title="OrangeHRM";
		String act_title="";
		try
		{
		 act_title=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]")).getText();
		}
		catch(NoSuchElementException e) {}
		String accpt_title="Dashboard";
		
		if(act_title.equals(accpt_title))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.quit();
	}
}
