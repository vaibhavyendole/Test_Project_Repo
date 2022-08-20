package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class E_dependsOnMethods2 {
	@Test		
	public void login1() 
	{
		Reporter.log("running login1 TC...",true);
	}
	
	@Test(timeOut=5000)		
	public void login2() throws InterruptedException 
	{
		Thread.sleep(1000);
		Reporter.log("running login2 TC...",true);
	}
	
	
	@Test(dependsOnMethods = {"login1", "login2"})
	public void logout() 
	{
		Reporter.log("running logout TC...",true);
	}
}








