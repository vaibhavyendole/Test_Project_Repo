package ListBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class E_getFirstSelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Jordan/Desktop/Velocity%20Testing1/HTML/Select_Country1.html");
		
		//Step.1 Select the webelement which need to be handled then stored it in refrence Variable
		WebElement country = driver.findElement(By.xpath("//select[@id='1234']"));
		
		//Step.2  create an Object of the Select class which accept the argument of WebElement
		Select cc = new Select(country);
		
		Thread.sleep(4000);
		//Step.3 Use Select class methods to Select desire options
		
		cc.selectByVisibleText("Pakistan");
				Thread.sleep(3000);
		cc.selectByVisibleText("India");
				
		//Method.1
		//WebElement selectOption = cc.getFirstSelectedOption();
		//String text = selectOption.getText();
		//System.out.println(text);		//India
		
		//Method.2
		//String text1 = cc.getFirstSelectedOption().getText();
		//System.out.println(text1);	//India
		
		//Method.3
		System.out.println(cc.getFirstSelectedOption().getText());
		}
}
