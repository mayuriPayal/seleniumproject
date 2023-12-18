package mavenselenium_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelCheckbox {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(10);
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	}

}
