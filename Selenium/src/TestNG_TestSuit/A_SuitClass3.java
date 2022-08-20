package TestNG_TestSuit;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A_SuitClass3 {
	@Test	(priority =4)	
	public void TC5() 
	{
		Reporter.log("running TC5...",true);
	}
	
	@Test	(priority =5)	
	public void TC6() 
	{
		Reporter.log("running TC6...",true);
	}
}
