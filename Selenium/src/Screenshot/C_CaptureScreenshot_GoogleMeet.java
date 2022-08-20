package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class C_CaptureScreenshot_GoogleMeet {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://meet.google.com/");
		
		// Step.1 Typecast webdriver object into TakesScreenshot interface then call method getScreenshotAs and pass the argument 
		//OutputType.File
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String RS = RandomString.make(2);
		// Step.2 
		
		File dest = new File("H:\\Velocity Testing\\Screenshot\\Googlemeet"+RS+".jpg");
		
		FileHandler.copy(src, dest);
	}

}
