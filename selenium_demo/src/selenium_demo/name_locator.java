package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class name_locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumworkspace\\chromedriver.exe");
		ChromeDriver ch=new ChromeDriver ();
		ch.get("https://www.google.com/");
		ch.manage().window().maximize();
		ch.findElement(By.name("btnK")).click();
		ch.findElement(By.name("q")).sendKeys("Mindscript");
	}

}
