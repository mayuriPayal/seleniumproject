package basic_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alret {

	public static void main(String[] args) {
		
			WebDriver d=new ChromeDriver();
		    d.get("https://the-internet.herokuapp.com/javascript_alerts");
		    //d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			d.manage().window().maximize();
			
			d.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		 Alert main   =d.switchTo().alert();
		 System.out.println(main.getText());
		 main.sendKeys("hello");
		 main.accept();

	}

}
