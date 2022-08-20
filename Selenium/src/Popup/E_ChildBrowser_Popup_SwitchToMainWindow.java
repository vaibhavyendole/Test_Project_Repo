package Popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_ChildBrowser_Popup_SwitchToMainWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Click on the NewTab Button
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//Get Child window Id
		Set<String>	AllIDs = driver.getWindowHandles(); //[Main Page ID(0), ChildId(1)]
		
		ArrayList<String> al = new ArrayList<String>(AllIDs);
		
		//Switch to child Window
		driver.switchTo().window(al.get(1));
		
		//Click on Element Present on Child Popup
		driver.findElement(By.xpath("//span[text()='Training'][1]")).click();
		
		// Switch to Main Window
		driver.switchTo().window(al.get(0));
		
		driver.findElement(By.xpath("//input[@name='NewWindow']"));
	}
}
