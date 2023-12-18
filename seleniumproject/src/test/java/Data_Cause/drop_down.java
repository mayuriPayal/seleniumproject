package Data_Cause;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drop_down {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
	    ChromeDriver d=new ChromeDriver();
	    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	WebElement dp=	d.findElement(By.id("country-list"));
	Select dps=new Select(dp);
		//dps.selectByIndex(2);
		dps.selectByVisibleText("USA");
	List<WebElement> op=dps.getOptions();
	
	for (WebElement x: op)
	{
		System.out.println(x.getText());
	}
		

}
}