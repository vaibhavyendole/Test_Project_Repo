package POM_With_PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//Regular class i.e. main method not present	//POM Class
public class A_kiteLogin1Page {
//Step.1 Declaration of variable Globally with access level private
//Use @findBy Annotation
		@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	
		@FindBy(xpath="//input[@id='password']") private WebElement PASS;
		
		@FindBy(xpath="//button[text()='Login ']") private WebElement SbtBtn;
	
//Step.2 Initialization : Initialize within a constructor with access level public
	
		public A_kiteLogin1Page(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
//Step.3 Usage : Utilize within a method with Access level public
		public void enterUN()
		{
			UN.sendKeys("DV1510");
		}
		public void enterPass()
		{
			PASS.sendKeys("Pass@123");
		}
		public void clickButton()
		{
			SbtBtn.click();
		}	
}




















