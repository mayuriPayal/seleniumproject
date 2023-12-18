package basic_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium5_conditionalMethod {

	public static void main(String[] args) {
    WebDriver d=new ChromeDriver();
 d.navigate().to("https://demo.nopcommerce.com/");
 WebElement ds=  d.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));

	}

}
