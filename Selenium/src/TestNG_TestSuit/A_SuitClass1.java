package TestNG_TestSuit;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A_SuitClass1 {
	@Test		
	public void TC1() 
	{
		Reporter.log("running TC1...",true);
	}
	
	@Test(priority =1)	
	public void TC2() 
	{
		Reporter.log("running TC2...",true);
	}
}
