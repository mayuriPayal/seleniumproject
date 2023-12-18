package Basic_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class selectDp {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
	WebElement dropdw=	driver.findElement(By.name("Country"));
	Select country=new Select(dropdw);
	country.selectByValue("India");
//		System.out.println(country.getOptions().size());
		
		//name to print 

	
	 List<WebElement>  dwn  =country.getOptions();
	 
	 for(WebElement ooo:dwn)
	 {
		 System.out.println(ooo.getText());
	 }
			
		
	}

}
