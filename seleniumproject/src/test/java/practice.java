import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {

	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement sec = driver.findElement(By.name("passCount"));
		Select cou=new Select(sec);
		cou.selectByIndex(2);
		
		/*WebElement secc = driver.findElement(By.name("fromPort"));
		Select couu=new Select(secc);
		cou.selectByIndex(3);*/
		
		Select cou1=new Select(driver.findElement(By.name("fromPort")));
		cou1.selectByVisibleText("London");
		
		Select cou2=new Select(driver.findElement(By.name("fromMonth")));
		cou2.selectByVisibleText("May");
		
		Select cou3=new Select(driver.findElement(By.name("fromDay")));
		cou3.selectByValue("5");
		
		Select cou4=new Select(driver.findElement(By.name("fromPort")));
		cou4.selectByVisibleText("London");
		
		Select cou5=new Select(driver.findElement(By.name("fromMonth")));
		cou2.selectByVisibleText("May");
		
		driver.findElement(By.xpath("//tbody/tr[9]/td[2]/font[1]/font[1]/input[1]")).click();
		
		Select cou6=new Select(driver.findElement(By.name("airline")));
		cou6.selectByVisibleText("Blue Skies Airlines");

		
	}

}
