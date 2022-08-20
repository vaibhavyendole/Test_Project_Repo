package TestNGe_Verification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A_assertEquals {
	@Test
	public void assertEquals()
	{
		String actResult = "Velocity";
		String expResult = "Velocity";
		String FailedResult2 ="City";
		
		Assert.assertEquals(actResult, FailedResult2, "Failed: Both Result are Different");
	//Note : "Failed: Both Result are Different" this message will display only if test case Fail.
	}
}
