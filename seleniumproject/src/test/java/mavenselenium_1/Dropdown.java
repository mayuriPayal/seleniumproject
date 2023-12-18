package mavenselenium_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {

			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.orangehrm.com/en/contact-sales/");
		WebElement drop=	driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
		Select dropcon=new Select(drop);
		//dropcon.selectByVisibleText("India");
	  //  dropcon.selectByIndex(3);
		//dropcon.selectByValue("2");
      List<WebElement> opt= dropcon.getOptions();
      System.out.println(opt.size());
   /*   for(int i=0;i<opt.size();i++)
      {
    	  System.out.println(opt.get(i).getText());
      }*/
      
for(WebElement op:opt)
{
	System.out.println(op.getText());
}
	}

}
