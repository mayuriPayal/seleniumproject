package Data_Cause;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Down_scroll {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.get("https://datacause.in/");
		JavascriptExecutor js=(JavascriptExecutor) d;
		//WebElement flag=d.findElement(By.name("fullname"));
		/*js.executeScript("arguments[0].scrollIntoView();",flag);
		d.findElement(By.name("fullname")).sendKeys("mayu");
		d.findElement(By.name("email")).sendKeys("mayu.sat@");
		d.findElement(By.name("phone")).sendKeys("2345");
		d.findElement(By.name("course")).sendKeys("da");*/
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		
		
		
	}

}
