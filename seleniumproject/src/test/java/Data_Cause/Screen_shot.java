package Data_Cause;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screen_shot {

	public static void main(String[] args) throws IOException {

	WebDriverManager.chromedriver().setup();
	ChromeDriver d=new ChromeDriver();
	d.get("https://demo.nopcommerce.com/");
	TakesScreenshot ts=d;
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	File trget=new File("D:\\seleniumworkspace\\seleniumproject\\FULLPGSC\\FL.png");
	FileUtils.copyFile(src, trget);
	}
	
	
}
