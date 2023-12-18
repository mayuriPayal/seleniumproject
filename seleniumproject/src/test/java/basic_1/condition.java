package basic_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class condition {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
	    d.get("https://demo.nopcommerce.com/register");
	    //d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		/*boolean status=d.findElement(By.xpath("//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")).isDisplayed();
		System.out.println(status);*/
		boolean male=	d.findElement(By.id("gender-male")).isSelected();
		boolean fe=d.findElement(By.id("gender-female")).isSelected();
		System.out.println(male);
		System.out.println(fe);
	}

}