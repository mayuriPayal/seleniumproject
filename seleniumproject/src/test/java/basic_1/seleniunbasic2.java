package basic_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniunbasic2 {

	public static void main(String[] args) {

		WebDriver d=new ChromeDriver();
		d.get("https://admin-demo.nopcommerce.com/login?");
		WebElement  cl=d.findElement(By.id("Email"));
	cl.clear();
	cl.sendKeys("admin@yourstore.com");
	WebElement  c2=d.findElement(By.id("Password"));
	c2.clear();
	c2.sendKeys("admin");
	d.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		
	String title=d.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText()	;
	String title1="Dashboard";
	if(title.equals(title1))
	{
		System.out.println("match");
	}
	else
	{
		System.out.println("unmatchd");
	}
		
	}

}
