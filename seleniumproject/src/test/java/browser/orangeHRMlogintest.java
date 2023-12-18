package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangeHRMlogintest {

	public static void main(String[] args) throws InterruptedException {
//System.setProperty("webdriver.chrome.driver","D:\\seleniumworkspace\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
 //ChromeDriver driver = new ChromeDriver();
	//open the browser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	// open url
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(5000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	//String act_title=driver.getTitle();
	//String acct_tit="OrangeHRM";
	String act_title="null";
	try {
	act_title=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	}
	catch(NoSuchElementException e) {}
	
	Thread.sleep(9000);
	String acct_tit="Dashboard";
	
	
	if(act_title.equals(acct_tit))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	//driver.close();
	driver.quit();
	
	
	}
	
}
