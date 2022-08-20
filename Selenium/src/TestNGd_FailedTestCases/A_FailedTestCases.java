package TestNGd_FailedTestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A_FailedTestCases {
	@Test
	public void TC1()
	{
		Reporter.log("Running TC1",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}
	@Test
	public void TC3()
	{
		Reporter.log("Running TC3",true);
	}
	@Test
	public void TC4()
	{
		Assert.fail();
		Reporter.log("Running TC4",true);
	}
	@Test
	public void TC5()
	{
		Reporter.log("Running TC5",true);
	}
	@Test
	public void TC6()
	
	{	
		
		Reporter.log("Running TC6",true);
	}
}

