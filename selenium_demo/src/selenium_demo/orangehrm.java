package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

// BY NAME LOCATOR
public class orangehrm {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\seleniumworkspace\\chromedriver.exe");
			ChromeDriver ch=new ChromeDriver ();
			ch.get("https://www.orangehrm.com/");
		ch.get("https://www.orangehrm.com/en/contact-sales/");
        ch.manage().window().maximize();
		ch.findElement(By.name("FullName")).sendKeys("mayuri");
		ch.findElement(By.name("Contact")).sendKeys("123");
		ch.findElement(By.name("Email")).sendKeys("mayu@123gmail.com");
		ch.findElement(By.name("JobTitle")).sendKeys("QA");


	}

}
