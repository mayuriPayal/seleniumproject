package Basic_selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		
	Set<String> idd= 	driver.getWindowHandles();
		/*//System.out.println(idd);
	List<String> windowid=new ArrayList(idd);
	
String parent=	windowid.get(0);

String child=	windowid.get(1);	
driver.switchTo().window(child);
driver.findElement(By.xpath("//body/nav[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/a[1]/button[1]")).click();
driver.switchTo().window(parent);
driver.findElement(By.name("username")).sendKeys("mayu");*/
	
		for(String qwe:idd	)
		{
		String title=driver.switchTo().window(qwe).getTitle();
		if(title.equals("OrangeHRM HR Software | OrangeHRM"))
		{
			driver.findElement(By.xpath("//body/nav[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/a[1]/button[1]")).click();
		}
		}
	}
	
}
