package Basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_commerse {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
WebElement com=driver.findElement(By.name("Email"));
com.clear();
com.sendKeys("admin@yourstore.com");
WebElement pas= driver.findElement(By.name("Password"));
pas.clear();
pas.sendKeys("admin");
driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
Thread.sleep(3000);
String actl=driver.findElement(By.xpath(  "//h1[contains(text(),'Dashboard')]")).getText();
String act="Dashboard";
if(actl.equals(act))
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}


driver.quit();


	}

}
