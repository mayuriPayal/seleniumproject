package basic_1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium10_screenshots {

	public static void main(String[] args) throws IOException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demo.nopcommerce.com/");
		//TakesScreenshot sc=(TakesScreenshot)d;
		//sc.getScreenshotAs(OutputType.FILE);
		TakesScreenshot sc=(TakesScreenshot)d;
		File src=sc.getScreenshotAs(OutputType.FILE);
		File trg=new File("D:\\seleniumworkspace\\seleniumproject\\screenshot.png")	;
		FileUtils.copyFile(src, trg);
	}

}
