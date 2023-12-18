package mavenselenium_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_boxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		//driver.findElement(By.xpath("//input[@id='vfb-6-0']")).click();
	List<WebElement>chkbo=driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println(chkbo.size());
	
	for(int i=0;i<chkbo.size();i++)
	{
		chkbo.get(i).click();
		
		
	/*for(WebElement box:chkbo)
	{
		box.click();
	
	/*for(int i=2;i<chkbo.size();i++)
	{
		chkbo.get(i).click();
	}*/
	
	/*for(int i=0;i<2;i++)
	{
		chkbo.get(i).click();
	}*/
		
	Thread.sleep(5000);
		
	for(i=0;i<chkbo.size();i++)
	{
		chkbo.get(i).click();
	
	}
	}
	}
}
