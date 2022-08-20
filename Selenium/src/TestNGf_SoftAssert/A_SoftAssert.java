package TestNGf_SoftAssert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class A_SoftAssert {
	@Test
	public void softAssert()
	{
		SoftAssert soft = new SoftAssert();
		
		String s1 = "abc";
		String s2 = "pqr";
		soft.assertEquals(s1, s2, "Failed1 :Both Results are Different");
		
		String s3 ="Velocity";
		String s4 ="Pune";
		soft.assertNotEquals(s3, s4,"Failed2 : Both Results are Same");
		
		boolean s5 = true;
		soft.assertTrue(s5);
		
		
		soft.assertAll();	//This one is mandotory to mention at the end.
	}
}
