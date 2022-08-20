package TestNGe_Verification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C_AssertTrue {
	@Test
	public void AssertTrue()
	{
		boolean actResult = true;
		Assert.assertTrue(actResult);
	}
	//Test Case will Pass if result = true
	// TEst Case Will Fail if result = false
}
