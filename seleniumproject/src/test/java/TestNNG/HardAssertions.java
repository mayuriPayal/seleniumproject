package TestNNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	@Test
	void test()
	{
		/*int x=10;
		int y=10;
		Assert.assertEquals(x, y);*/
		
		int x=10;
		int y=10;
	//	Assert.assertEquals(x, y);
		
		Assert.assertNotEquals(x, y);
		Assert.assertEquals(x, y);
	}

}
