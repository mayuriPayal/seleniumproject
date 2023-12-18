package basic_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumbasic_3 {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("http://www.automationpractice.pl/index.php");
		
	// with integer
		
	    /*	int sliders=	d.findElements(By.className("homeslider-container")).size();
	    	System.out.println(sliders);*/
   //without integer
		
		 List<WebElement> sliders=	d.findElements(By.className("homeslider-container"));
		 System.out.println(sliders.size());
		 
		 List<WebElement> imgg= d.findElements(By.tagName("img"));
		 System.out.println(imgg.size());
		 
		 List<WebElement> link= d.findElements(By.tagName("a"));
		 System.out.println(link.size());

	}

}
