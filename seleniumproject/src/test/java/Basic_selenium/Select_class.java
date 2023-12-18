package Basic_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_class {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(1000);
    driver.get("https://www.orangehrm.com/en/contact-sales/");
	WebElement country=	  driver.findElement(By.name("Country"));
		 Select dropdwn =new Select (country);
	//	 dropdwn.selectByVisibleText("India");
		// dropdwn.selectByIndex(2);
		// dropdwn.selectByValue("3");
		//System.out.println(dropdwn.getOptions().size());
		 
List<WebElement> opt= dropdwn.getOptions();
for(WebElement dp:opt)
{
	System.out.println(dp.getText());	
}
		 
	}

}
