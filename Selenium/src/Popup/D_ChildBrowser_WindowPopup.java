package Popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_ChildBrowser_WindowPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://skpatro.github.io/demo/links/");
	
		//Click on the New Tab button
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		//It will open a new Tab
		
		//Get child window ID-->.getWindowHandles()--> get Id of both Main and Child Page
		Set<String> AllIds = driver.getWindowHandles();
		System.out.println(AllIds);// get  main page Id as well as Child Page ID (Id1,ID2)
	
		//Get only Child Window Id
		String ChildID = driver.getWindowHandle();
		System.out.println(ChildID); //will get Id of only Child browser
		
		ArrayList<String> al = new ArrayList<String>(AllIds);	// [mainPage ID(0), ChildWindowID(1)]
		String ChildWindowID = al.get(1);
		System.out.println(ChildWindowID);
		
		//Switch to Child Window
		driver.switchTo().window(ChildWindowID);
		
		//Click on Element of the Child Browser
		driver.findElement(By.xpath("//span[text()='Training'][1]")).click();
	}
}
 