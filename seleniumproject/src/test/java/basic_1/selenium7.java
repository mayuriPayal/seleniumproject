package basic_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium7 {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
    d.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
    WebElement country= d.findElement(By.name("country"));
    Select country1 =new Select(country);
    
    //country1.selectByIndex(3);
   // country1.selectByVisibleText("Brazil");
   // country1.selectByValue("1");

//total options
  //  System.out.println(country1.getOptions().size());
    
List <WebElement> options = country1.getOptions();
//options.size();
for(WebElement op:options)
{
	System.out.println(op.getText());
}



	}

}
