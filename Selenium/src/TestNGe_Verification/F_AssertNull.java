package TestNGe_Verification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class F_AssertNull {
	@Test
	public void assrtNull()
	{
		String actNull = "Automation";	//Fail
		Assert.assertNull(actNull);
	}
	// If Result is Null then TC Pass
	//If Result contains value then TC Fail
}
