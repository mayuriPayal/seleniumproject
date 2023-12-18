package basic_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dp {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
	    d.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	    //d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
	WebElement country=	d.findElement(By.id("country-list"));
Select cou1=new Select(country);
cou1.selectByVisibleText("Brazil")	;
List<WebElement>  drp=cou1.getOptions();


System.out.println(cou1.getOptions().size());
for(WebElement list:drp)
{
	System.out.println(list.getText());
}
	}

}
