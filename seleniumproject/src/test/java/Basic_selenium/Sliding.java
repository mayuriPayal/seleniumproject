package Basic_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sliding {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.get("http://www.automationpractice.pl/index.php");
	//	Thread.sleep(3000);
	/*List<WebElement> sliders= driver.findElements(By.className("homeslider-container"));
sliders.size();*/
	//	System.out.println(driver.findElements(By.className("homeslider-container")).size());
		
		driver.get("https://demo.nopcommerce.com/");	
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
	//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
	driver.findElement(By.cssSelector("input[name='q']")).sendKeys("MacBook");
	//	driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("MacBook");

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
