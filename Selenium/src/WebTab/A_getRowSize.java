package WebTab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_getRowSize {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("C:\\Users\\Jordan\\Desktop\\Extra\\Testing1\\HTML\\Table.html");
		 
		 int RowSize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		 System.out.println(RowSize);
		
	}

}
