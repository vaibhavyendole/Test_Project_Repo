package ListBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class D_ListBox_IsMultiSelectable1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Jordan/Desktop/Velocity%20Testing1/HTML/Select_Country1.html");
			Thread.sleep(2000);
		//Step.1
		WebElement country = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Thread.sleep(2000);
		//Step.2
		Select cc = new Select(country);
		
		Thread.sleep(2000);
		boolean result = cc.isMultiple();
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("Option is multiSelectable");
		}
		else
		{
			System.out.println("Option is Not multiSelectable");
		}	}	}
