package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class C_enabled {
	@Test
	public void TC1()
	{
		Reporter.log("Running TC1", true);
	}
	
	@Test(enabled = false)
	public void TC2()
	{
		Reporter.log("Running TC2", true);
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("Running TC3", true);
	}
//Here TC2 is Enabled = false i.e Disabled 
// So only TC1 and TC3 will Execute
}
