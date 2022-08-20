package TestNG_TestSuit;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class A_SuitClass2 {
	@Test(priority =2)		
	public void TC3() 
	{
		Reporter.log("running TC3...",true);
	}
	
	@Test(priority =3)		
	public void TC4() 
	{
		Reporter.log("running TC4...",true);
	}
}
