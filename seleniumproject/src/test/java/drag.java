import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {

/*	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");
	WebElement from=driver.findElement(By.id("draggable"));
	WebElement to=driver.findElement(By.id("droppable"));
	Actions	act=new Actions(driver);
	act.dragAndDrop(from, to).perform();
	}*/
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop Action')]")).click();
		WebElement from=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement to=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Actions	act=new Actions(driver);
		act.dragAndDrop(from, to).perform();
		
	
	
	
	
	
	}
	}
