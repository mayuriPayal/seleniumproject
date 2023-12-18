package Basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalc {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		//boolean ststus=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
	 //   System.out.println(ststus);
	WebElement status=	driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
	status.isDisplayed();
WebElement  male=	driver.findElement(By.xpath("//input[@id='gender-male']"));
WebElement female=	driver.findElement(By.xpath("//input[@id='gender-female']"));
	
System.out.println("BEFORE SELECTION");
System.out.println(male.isSelected());
	System.out.println(female.isSelected());
	female.click();
	System.out.println("AFTER SELECTION");
	System.out.println(male.isSelected());
	System.out.println(female.isSelected());
	
	WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	System.out.println("Dispay status:"+searchbox.isDisplayed());
	System.out.println("Enable status:"+searchbox.isEnabled());
	
	}

}
