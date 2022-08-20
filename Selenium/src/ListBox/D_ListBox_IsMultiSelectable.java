package ListBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class D_ListBox_IsMultiSelectable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(6000);
		//Step.1
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		
		Thread.sleep(3000);
		//Step.2 
		Select dd = new Select(day);
		
		// Use of isMultiple();
		Thread.sleep(3000);
		boolean result = dd.isMultiple();
		System.out.println(result);
		if(result==true)
		{
			System.out.println("WebElement is MultiSelectable");
		}
		else
		{
			System.out.println("WebElement is Not MultiSelectable");
		}	
	}
}
