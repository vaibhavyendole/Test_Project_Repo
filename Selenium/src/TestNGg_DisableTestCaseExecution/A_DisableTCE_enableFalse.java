package TestNGg_DisableTestCaseExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A_DisableTCE_enableFalse{
	@Test
	public void TC1()
	{
		Reporter.log("Running TC1", true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("Running TC2", true);
	}
	
	@Test(enabled=false) 	//Approach 1 : enabled = false             
	public void TC3() 
	{
		Reporter.log("running TC3...",true);
	}
}
