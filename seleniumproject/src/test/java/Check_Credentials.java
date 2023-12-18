import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check_Credentials {

  public static void main(String[] args) throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://datacause.in/careerhome.html");
	  Thread.sleep(2000);
	  
	WebElement element=driver.findElement(By.id("jt"));
	
	Select dropdown = new Select(element);
	
	dropdown.selectByVisibleText("WebDevelopment");
	  
}
  
	 
}
