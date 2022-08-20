package Module1_Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_loginPage2 {
	//Step.1 Declaration
	@FindBy(xpath="//input[@id='pin']") private WebElement PIN;
	
	@FindBy(xpath="//button[text()='Continue ']") private WebElement Continue;
	
	//Step.2 Initialize
	
	public A_loginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//Step.3 Usage
	
	public void setEnterPin(String entPin)
	{
		PIN.sendKeys(entPin);
	}
	
	public void clickContinue()
	{
		Continue.click();
	}
}
//input[@id='userid']		//input[@id='password']		//button[text()='Login '] 		DV1510 		Pass@123 

	//input[@id='pin']			//button[text()='Continue ']							959594

	//span[@class='user-id']











