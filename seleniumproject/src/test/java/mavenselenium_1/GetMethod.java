package mavenselenium_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
	    
	/*	System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		String ps=driver.getPageSource() ;
	System.out.println(ps.contains("html") );
		 System.out.println(driver.getWindowHandle());
		 System.out.println(driver.getWindowHandles());*/
	/*	System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getPageSource());
		 System.out.println(driver.getPageSource().contains("htm"));*/
		 
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());


		
	}

}