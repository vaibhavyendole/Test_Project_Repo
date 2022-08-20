package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class D_timeOut {
	@Test(timeOut = 5000)
	public void TC1() throws InterruptedException
	{
		Thread.sleep(7000);
		Reporter.log("Running TC1", true);
	}
//Use to Fail the Test Case if Time Required for execution is more.
}
