package basic_1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium9 {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://the-internet.herokuapp.com/javascript_alerts");
		/*d.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
	Alert altwn=d.switchTo().alert();
	System.out.println(altwn.getText());
	//altwn.accept();
	altwn.dismiss();*/
	d.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
	Alert altwn=d.switchTo().alert();

	//System.out.println(altwn.getText());
	altwn.sendKeys("nag");
	altwn.accept();
	}

}
