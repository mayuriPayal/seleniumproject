package basic_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log_In {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d=new ChromeDriver();
	    d.get("https://opensource-demo.orangehrmlive.com/");
	   // Thread.sleep(5000);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*d.findElement(By.name("username")).sendKeys("Admin");
		d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		d.navigate().back();	*/
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getPageSource());
		System.out.println(d.getTitle());
	}

}
