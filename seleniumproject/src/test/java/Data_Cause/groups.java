package Data_Cause;

import org.testng.annotations.Test;

public class groups {
	
	@Test(priority=1,groups= {"sanity"})
	void loginbyemail()
	{
		System.out.println("loginbyemail");
	}
	
	
	@Test(priority=2,groups= {"sanity","regression"})
	void loginbyfb()
	{
		System.out.println("loginbyfb");	
	}
	
	
	@Test(priority=3,groups= {"regression"})
	void loginbyinsta()
	{
		System.out.println("loginbyinsta");		
	}
	
	@Test(priority=4,groups= {"sanity","regression"})
	void singbyemail()
	{
		System.out.println("singbyemail");	
	}
	
	@Test(priority=5,groups= {"regression"})
	void singbyfb()
	{
		System.out.println("singbyfb");	
	}
	@Test(priority=6,groups= {"sanity","regression"})
	void singbyinsta()
	{
		System.out.println("singbyinsta");	
	}
	
	@Test(priority=7,groups= {"sanity"})
	void dollaar()
	{
		System.out.println("dollaar");
	}
	@Test(priority=8,groups= {"regression"})
	void rupee()
	{
		System.out.println("rupee");
	}
	
	@Test(priority=9,groups= {"sanity"})
	void cad()
	{
		System.out.println("cad");
	}
	
	
	
	
	
	
	
}
