package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.Assert;

public class E_dependsOnMethods {
	@Test		
	public void login() 
	{
		Assert.fail();	// Forcefully fail the method
		Reporter.log("running login TC...",true);
	}
	
	@Test(dependsOnMethods= {"login"})		
	public void logout() 
	{
		Reporter.log("running logout TC...",true);
	}
	//Logout is depends upon login Method
}
