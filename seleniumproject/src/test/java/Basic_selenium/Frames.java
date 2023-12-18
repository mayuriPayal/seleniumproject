package Basic_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://ui.vision/demo/webtest/frames/");
		
	WebElement frame1=	driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver.switchTo().frame(frame1);	
	driver.findElement(By.name("mytext1")).sendKeys("mayu");
	driver.switchTo().defaultContent();	
	
	/*WebElement frame3=	driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(frame3);
	driver.findElement(By.name("mytext3")).sendKeys("33545");
	//driver.switchTo().defaultContent();	
driver.switchTo().frame(0);
driver.findElement(By.cssSelector("div.AB7Lab")).click();*/
	
	
	}

}
