package TestNNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
	@Test
		void test_hardassertions()
		{
			
			System.out.println("testing....");
			System.out.println("testing....");
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(1, 2); 
			
			System.out.println("soft assertion completed.....");
			sa.assertEquals(1, 1);
			
			sa.assertAll(); // mandatory
		
		
		
		
		}
	
	
	
	
	
	
	
}