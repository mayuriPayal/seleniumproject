package mavenselenium_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sliders {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.get("http://www.automationpractice.pl/index.php");
    driver.manage().window().maximize();
    
   List<WebElement> sliders=driver.findElements(By.className("homeslider-container"));
    System.out.println(sliders.size());
    
 List<WebElement>image =driver.findElements(By.tagName("img"));
System.out.println(image.size());

List<WebElement> links=  driver.findElements(By.tagName("a"));
System.out.println(links.size());
		
	}

}
