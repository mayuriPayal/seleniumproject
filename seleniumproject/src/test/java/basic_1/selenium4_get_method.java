package basic_1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium4_get_method {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getPageSource().contains("html"));
		System.out.println(d.getWindowHandle());
		Thread.sleep(3000);
		d.findElement(By.linkText("OrangeHRM, Inc")).click();
	System.out.println(d.getWindowHandles());
Set<String>	ids=d.getWindowHandles();
for(String wid:ids)
{
	System.out.println(wid);
}
		
		
	}

}
