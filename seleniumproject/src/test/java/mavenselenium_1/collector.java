
package mavenselenium_1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class collector {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
	/*WebElement logo=driver.findElement(By.xpath("//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]"));
	System.out.println(logo.isDisplayed());	
	
	WebElement inputb=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	
	System.out.println(inputb.isDisplayed());
	System.out.println(inputb.isEnabled());*/

	//WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
	//WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
	WebElement male= driver.findElement(By.id("gender-female"));                                   
	
	System.out.println(male.isSelected());
	//System.out.println(female.isSelected());

	}

}
