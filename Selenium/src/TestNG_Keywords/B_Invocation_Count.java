package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class B_Invocation_Count {
	
	@Test(invocationCount = 4)
	public void TC1()
	{
		Reporter.log("Running TC1", true);
	}
///invocationCount = 4 means Execute TC1 Four Times
}
