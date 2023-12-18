package mavenselenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_test_OHRM {

	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver =new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	    //compare title
	  String actual_title=  driver.getTitle();
	  String accepted_title="OrangeHRM";
	  if(actual_title.equals(accepted_title))
	  {
		  System.out.println("test passes");
	  }
	  else 
	  {
		  System.out.println("fail");
	  }
	  
	 // driver.close();
	  driver.quit();
	
	}

}
