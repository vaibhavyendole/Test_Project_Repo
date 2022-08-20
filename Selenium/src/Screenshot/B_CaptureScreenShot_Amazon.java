package Screenshot;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import net.bytebuddy.utility.RandomString;

public class B_CaptureScreenShot_Amazon {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		String RS = RandomString.make(3);	// Use to add random character in name
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("H:\\Velocity Testing\\Screenshot\\amazon"+RS+".jpg");
		
		FileHandler.copy(src, dest);
	}
}












