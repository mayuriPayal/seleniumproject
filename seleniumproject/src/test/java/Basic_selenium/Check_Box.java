	package Basic_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Box {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(1000);
driver.get("https://demo.guru99.com/test/radio.html");
 //driver.findElement(By.id("vfb-6-0")).click();*/

List<WebElement> chkb = driver.findElements(By.xpath("//input[@type='checkbox' and @name='webform']"));
System.out.println(chkb.size());
/*int chkb = driver.findElements(By.xpath("//input[@type='checkbox' and @name='webform']")).size();
System.out.println(chkb);*/

/*for(WebElement box :chkb)
{
	box.click();
}

Thread.sleep(4000);
/*for(int i=2;i<chkb.size();i++)
{
	chkb.get(i).click();
}*/

/*for(WebElement box :chkb)
{
	box.click();
}*/

/*for(int i=0;i<2;i++)
{
	chkb.get(i).click();
}
Thread.sleep(4000);
for(int i=0;i<chkb.size();i++)
{
	if(chkb.get(i).isSelected())
	{
		chkb.get(i).click();
	}
}*/
	}

}
