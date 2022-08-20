package Module1_Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_loginPage1 {
	//Step.1 Declaration
	@FindBy(xpath="//input[@id='userid']")private WebElement ID;
	
	@FindBy(xpath="//input[@id='password']")private WebElement Pass;
	
	@FindBy(xpath="//button[text()='Login ']") private WebElement lgnBtn;
	
	//Step.2 Initialize
	
	public A_loginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setEnterID(String userID)
	{
		ID.sendKeys(userID);
	}
	
	public void setEnterPass(String EntPass)
	{
		Pass.sendKeys(EntPass);
	}
	
	public void clickLoginButton()
	{
		lgnBtn.click();
	}
}



//input[@id='userid']		//input[@id='password']		//button[text()='Login '] 		DV1510 		Pass@123 

	//input[@id='pin']			//button[text()='Continue ']							959594

	//span[@class='user-id']