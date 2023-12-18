import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload {

    
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/upload/");
        driver.findElement(By.xpath("//input[@id='uploadfile_0']")).sendKeys("C:\\Users\\user\\Desktop\\RESUME\\123.pdf");
        driver.findElement(By.id("terms")).click();
        
        
	}

}
