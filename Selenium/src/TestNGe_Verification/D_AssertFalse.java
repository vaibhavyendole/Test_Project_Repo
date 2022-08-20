package TestNGe_Verification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D_AssertFalse {
	@Test
	public void AsserFalse()
	{
		boolean actResult = false;
		Assert.assertFalse(actResult);
	}
	//Test Case will Pass if result = false
	// Test Case Will Fail if result = true
}
