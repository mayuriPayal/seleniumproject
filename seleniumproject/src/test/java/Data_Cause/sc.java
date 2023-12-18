package Data_Cause;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sc {

	public static void main(String[] args) throws IOException {

		ChromeDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	    d.get("https://datacause.in/");
	    TakesScreenshot sc=d;
	   File src= sc.getScreenshotAs(OutputType.FILE);
	    File trg=new File("D:\\seleniumworkspace\\seleniumproject\\FULLPGSC\\123.png") ;
		FileUtils.copyFile(src, trg);
	}

}
