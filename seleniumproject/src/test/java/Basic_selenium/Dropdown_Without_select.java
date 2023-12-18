package Basic_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Without_select {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(1000);
    driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
    driver.manage().window().maximize();
    
    driver.findElement(By.xpath("//span[contains(text(),'HTML, CSS')]")).click();
    
   List<WebElement> opt = driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));
/*System.out.println(opt.size());

for(WebElement optttt:opt)
{
System.out.println(optttt.getText());
	
}*/
 /*  for(int i=0;i<opt.size();i++)
   {
	   if(opt.get(i).getText().equals("Java"))
	   {
		  opt.get(i).click(); 
		
	   }
   }*/

for(WebElement optttt:opt)
{
	if(optttt.getText().equals("Java"))
	{
		optttt.click();
	}
}
	}

	
}
