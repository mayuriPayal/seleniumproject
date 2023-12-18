package Basic_selenium;

/*6) Verify the title of dashboard page   
Exp title : OrangeHRM
7) close browser*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orange_HRM {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		String act=driver.getTitle();
        String exp   ="OrangeHRM";
        if(act.equals(exp))
        {
        	System.out.println("pass");
        }
        else
        {
        	System.out.println("fail");
        }

	driver.quit();
	
	
	
	

	}

}
