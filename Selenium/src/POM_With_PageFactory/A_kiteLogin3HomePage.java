package POM_With_PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM Class
public class A_kiteLogin3HomePage {
	//Step.1 Declare the variable globally with access level private
	@FindBy(xpath="//span[@class='user-id']") private WebElement UserID;
	
	//Step.2 Initialize within the constructor with access level public
	public A_kiteLogin3HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Step.3 Utilize within the method with access level public
	public void verifyID()
	{
		String actId = UserID.getText();
		String expId = "DV1510";
		
		if(actId.equalsIgnoreCase(expId))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}









