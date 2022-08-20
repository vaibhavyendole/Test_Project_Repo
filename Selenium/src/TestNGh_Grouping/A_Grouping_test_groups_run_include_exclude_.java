package TestNGh_Grouping;

import javax.swing.GroupLayout.Group;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A_Grouping_test_groups_run_include_exclude_ {
	@Test(groups = "login")
	public void TC1()
	{
		Reporter.log("Running TC1", true);
	}
	
	@Test (groups = "payment")
	public void TC2()
	{
		Reporter.log("Running TC2", true);
	}
	
	@Test (groups = "login")
	public void TC3()
	{
		Reporter.log("Running TC3", true);
	}
	
	@Test
	public void TC4()
	{
		Reporter.log("Running TC4", true);
	}
	
	@Test (groups = "select plan")
	public void TC5()
	{
		Reporter.log("Running TC5", true);
	}
	
	@Test(groups = "payment")
	public void TC6()
	{
		Reporter.log("Running TC6", true);
	}
}
