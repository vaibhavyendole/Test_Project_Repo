package Handling_of_Multiple_Element;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_HandlingMultipleElements1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		 List<WebElement> AllLinks = driver.findElements(By.xpath("//a")); //Use "findElements"
		 //for finding all links always use //a
		 System.out.println(AllLinks.size());
		 
		 for(WebElement Links:AllLinks)	// Use for Each loop to print Multiple Elements
		 {
			 System.out.println(Links.getText());	
			 // Returns all the Text of the different Elements Link
		 }	
	}
}











