package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_getAll_Data_In_Row {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Jordan\\Desktop\\Extra\\Testing1\\HTML\\Table.html");
		
		for(int i=1; i<=3; i++)
		{																		//Runtime Xpath
			String CompleteRow = driver.findElement(By.xpath("//table[@id='1234']//tr[4]/td["+i+"]")).getText();
			System.out.print(CompleteRow+" ");		//3 Java 300 
		}
	}
}
