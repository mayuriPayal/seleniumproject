package mavenselenium_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_tables {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//total no of rows
       /* List<WebElement> rws=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println(rws.size());*/
		//List<WebElement> clm=driver.findElements(By.xpath("//table[@name='BookTable']//th"));
		//System.out.println(clm	.size());
		//String value= driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		//System.out.println(value);
		String clm= driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(clm);
	}

}
