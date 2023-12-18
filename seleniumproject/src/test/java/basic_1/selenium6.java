package basic_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
	d.get("https://demo.guru99.com/test/radio.html");
		
		//single checkbox
		
		//d.findElement(By.id("vfb-6-0")).click();
		
		// all checkbox 
	List<WebElement> siz=d.findElements(By.xpath( "//input[@type='checkbox' and @name='webform']"));
		System.out.println(siz.size());
		
	/*	for(WebElement chkbx:siz)
		{
			chkbx.click();
		}
		
		Thread.sleep(3000);
		for(int i=0;i<siz.size();i++) {
			siz.get(i).click();
		}
		
		//last checkbox
		/*for(int i=2;i<siz.size();i++)
		{
			siz.get(i).click();
		}*/
			
		for(int i=1;i<siz.size();i++)
		{
			siz.get(i).click();
		}
		for(int i=0;i<siz.size();i++)
		{
			if(siz.get(i).isSelected())
			{
				siz.get(i).click();	
		}
	}

	}}
