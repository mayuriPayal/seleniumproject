package browser;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.get("https://jqueryui.com/datepicker/");
  driver.manage().window(); 
  driver.switchTo().frame(0);
//  driver.findElement(By.id("datepicker")).sendKeys("15/20/2003");
  
	
	String year="2024";
	String month="December";
	String date="12";
  driver.findElement(By.xpath("//input[@id='datepicker']")).click();
  while(true)
  {
	 // String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	  String yer= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	//  if(mon.equals(month) && yer.equals(year))  
		  if( yer.equals(year))  
	  {
		  break;
	  }
	  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
  }
  /*while(true)
	{
		String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(mon.equals(month) && yr.equals(year))
		{
			break;
		}
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  // Future date*/
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();   //Past date
		
				
	
	
 
	}

}
