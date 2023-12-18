package basic_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium11_frames {

	public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/*d.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/bidi/package-summary.html");
		//d.switchTo().frame("related-package-summary");
		d.findElement(By.xpath("//a[contains(text(),'org.openqa.selenium.bidi.browsingcontext')]")).click();
        d.findElement(By.xpath("//body/div[1]/div[1]/main[1]/section[1]/ul[1]/li[2]/div[1]/div[2]/div[1]/div[3]/a[1]")).click();*/
		
		d.get("https://ui.vision/demo/webtest/frames/");
		WebElement  frm=d.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		d.switchTo().frame(frm);
      d.findElement(By.name("mytext1")).sendKeys("mayuri");
  	d.switchTo().defaultContent();
  	
	WebElement  frm1=	d.findElement(By.xpath("//frame[@src='frame_3.html']"));
  	d.switchTo().frame(frm1);
  	d.findElement(By.name("mytext3")).sendKeys("shashu");
  	d.switchTo().frame(0);
  d.findElement(By.cssSelector("div.AB7Lab")).click();	
  	
  	
  	
  	
  	
  	
  	
	}

}
