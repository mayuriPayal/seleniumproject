package mavenselenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ecommerce {

	public static void main(String[] args) {
  ChromeDriver driver=new ChromeDriver();
  driver.get("https://admin-demo.nopcommerce.com/");
  WebElement textbox=driver.findElement( By.name("Email"));
  textbox.clear();
  textbox.sendKeys("admin@yourstore.com");
  WebElement paswd =driver.findElement( By.name("Password"));
  paswd.clear() ;
	paswd.sendKeys("admi");
	driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
	
	//String act=driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[1]/a/p")).getText();
	
	String act=driver.getTitle();
	String exp="Dashboard / nopCommerce administration";
	if(act.equals(exp))
	{
		System.out.println("pass");
	}
	else {
	System.out.println("fail");
	}
	
	
	}

} 