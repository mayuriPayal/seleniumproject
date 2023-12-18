package Basic_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeLect {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.orangehrm.com/en/contact-sales/");
WebElement country =driver.findElement(By.name("Country"));
Select cou=new Select(country);
cou.selectByVisibleText("Belarus");
System.out.println(cou.getOptions().size());

List<WebElement> op=cou.getOptions();
for(WebElement wb:op)
{
	System.out.println(wb.getText());
}


	}

}
