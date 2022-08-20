package Screenshot;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A_CaptureScreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		//Step.1 typecast Webdriver object into TakesScreenshot() Interface
		//Step.2 call the method getScreenshotAs() and  pass  the argument OutputType.FILE
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("H:\\Velocity Testing\\Screenshot\\facebook.jpg");
				
		//Step.3 After Execution it captures the Screenshot to local memory, to move screenshot
		//from local memory to destination folder call the static method copy (_, _) which is 
		//present in FileHandler class which accepts two parameters as path of source 
		//and path of destination.
		
		FileHandler.copy(src, dest);
		}
}
