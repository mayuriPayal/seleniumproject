package Data_Cause;

import org.testng.Assert;
import org.testng.annotations.Test;

public class depend_method {
	
@Test(priority=1)
void login()
{
	Assert.assertTrue(true);
}


@Test(priority=2,dependsOnMethods= {"login"})
void search()
{
	Assert.assertTrue(false);
}


@Test(priority=3,dependsOnMethods= {"search"})
void advsearch()
{
	Assert.assertFalse(true);
}


@Test(priority=4,dependsOnMethods= {"advsearch"})
void logout()
{
	Assert.assertTrue(true);
}








}
