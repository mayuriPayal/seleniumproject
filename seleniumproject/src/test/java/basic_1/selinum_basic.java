package basic_1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selinum_basic {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		d.manage().window().maximize();
		d.findElement(By.name("username")).sendKeys("Admin");
		d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
		
	/*	String actl_title=d.getTitle()  ;
		String acpt_title="OrangeHRM";
		
		if(actl_title.equals(acpt_title))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}*/
		
		String actl_title="";   
		try {
			actl_title=d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6 ")).getText();
		}
		catch(NoSuchElementException e) {
			
		}
		String acpt_title="Dashboard";
		
		if(actl_title.equals(acpt_title))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
		
		//d.close();
	}

}
