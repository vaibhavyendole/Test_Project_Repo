package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A_Priority1 {
	
	@Test(priority = 2)
	public void TC1()
	{
		Reporter.log("Running TC1", true);
	}
	
	@Test(priority = 1)
	public void TC2()
	{
		Reporter.log("Running TC2", true);
	}
	
	@Test		//Bydefault priority = 0
	public void TC3()
	{
		Reporter.log("Running TC3", true);
	}
	
	@Test(priority = -7)
	public void TC4()
	{
		Reporter.log("Running TC4", true);
	}
	
	@Test(priority = -3)
	public void TC5()
	{
		Reporter.log("Running TC5", true);
	}

	//Note : Method will execute according to lowest value of priority
	//In Above Method Test case Execute in Order = -7, -3, 0, 1, 2 
	// If Two default Priority=0 then execute alphabetically
}
















