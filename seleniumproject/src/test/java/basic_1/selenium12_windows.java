package basic_1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium12_windows {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Set <String> windowIDs =  d.getWindowHandles();
	    List<String>windowidsList =new ArrayList(windowIDs);
	    
	    String parentWindowID=   windowidsList.get(0);
	    String childWindowID=  windowidsList.get(1);
	    d.switchTo().window(childWindowID);
	    d.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		
	}

}
