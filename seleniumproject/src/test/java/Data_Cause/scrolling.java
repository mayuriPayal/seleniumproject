package Data_Cause;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class scrolling {

	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    ChromeDriver d=new ChromeDriver();
    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  /*  d.get("https://datacause.in/");
    d.manage().window().maximize();
    JavascriptExecutor js=d;
    WebElement flag= d.findElement(By.name("city"));
    js.executeScript("arguments[0].scrollIntoView();", flag);*/
    
    d.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
    d.manage().window().maximize();
    JavascriptExecutor js=d;
    js.executeScript("window.scrollBy(0,3000)", "");
  // WebElement flag= d.findElement(By.xpath("//td[contains(text(),'Vietnam')]"));
//   js.executeScript("arguments[0].scrollIntoView();",flag);

	}

}
