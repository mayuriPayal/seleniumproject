package mavenselenium_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	//	driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
//	Alert alertwindow=	driver.switchTo().alert();
	//alertwindow.accept();
	//	alertwindow.dismiss();
	driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
	Alert alertwindow=	driver.switchTo().alert();
	System.out.println(alertwindow.getText());
	Thread.sleep(5000);
	alertwindow.sendKeys("welcome");

	alertwindow.accept();

	}

}
