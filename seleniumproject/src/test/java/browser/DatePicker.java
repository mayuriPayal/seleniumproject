package browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://jqueryui.com/datepicker/#default");
     driver.switchTo().frame(0);
     //Approach 1
     //driver.findElement(By.id("datepicker")).sendKeys("09/02/1994");
	//Approach 2
     
     driver.findElement(By.id("datepicker")).click();
     String year="2024";
		String month="October";
		String date="12";
     
     while(true)
     {
    	String mt= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
    String yer=	 driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
    	
     if(mt.equals(month) && yer.equals(year))
    		 {
    	 break;
    		 }
     
     driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	}

}
}