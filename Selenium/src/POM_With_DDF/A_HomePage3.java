package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_HomePage3 {
	//Step.1 Declaration
	@FindBy(xpath="//span[@class='user-id']") private WebElement UserID;
	
	//Step.2 Initialze
	public A_HomePage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Usage
	public void VerifyKiteHomePageUserID(String expID)
	{
		String actualID = UserID.getText();
		if(actualID.equals(expID))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
//input[@id='userid']		//input[@id='password']		//button[text()='Login '] 		DV1510 		Pass@123 

	//input[@id='pin']			//button[text()='Continue ']							959594

	//span[@class='user-id']