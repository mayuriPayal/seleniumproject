package basic_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium8 {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
	    d.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	    d.manage().window().maximize();
	 d.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button")).click();
	List <WebElement> op = d.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));
	System.out.println(op.size());
	/*for(WebElement options:op)
	{
		System.out.println(options.getText());
	}*/
	
	for(WebElement text :op)
	{
		String option=text.getText();
		if(option.equals("Java") || option.equals("Python"))
		{
			text.click();
		}
	}
	}

}
