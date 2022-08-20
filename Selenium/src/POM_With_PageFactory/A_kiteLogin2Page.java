package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Regular Class : No Main Method	//POM Class
public class A_kiteLogin2Page {
	//Step.1 Declare the variable globally with access level private
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	@FindBy(xpath="//button[text()='Continue ']")private WebElement cntBtn;
	
	//Step.2 Initialze within constructor with access level public
	public A_kiteLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Step.3 Usage: Utilize within a method access level public
	
	public void enterPin()
	{
		pin.sendKeys("959594");
	}
	
	public void clickButton2()
	{
		cntBtn.click();
	}
}











