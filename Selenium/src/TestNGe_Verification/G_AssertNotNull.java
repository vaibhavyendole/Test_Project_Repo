package TestNGe_Verification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class G_AssertNotNull {
	@Test
	public void assertNotNull()
	{
		String name = "Manul QA";
		Assert.assertNotNull(name);
	}
		// If Result is Null then TC Fail
		// If Result contains value then TC Pass
}
