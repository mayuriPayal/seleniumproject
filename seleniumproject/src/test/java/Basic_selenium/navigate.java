package Basic_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
 driver.get("https://www.amazon.in/");
 System.out.println(driver.getCurrentUrl());
 driver.navigate().to("https://www.flipkart.com/");
 System.out.println(driver.getCurrentUrl());
driver.navigate().back();
driver.navigate().forward();

driver.navigate().refresh(); 
	}

}
