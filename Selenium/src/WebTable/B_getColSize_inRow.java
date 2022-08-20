package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_getColSize_inRow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Jordan\\Desktop\\Extra\\Testing1\\HTML\\Table.html");
		
		int colSize = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();
		System.out.println(colSize);	//3
		
		//for Header
		int HeadColSize = driver.findElements(By.xpath("//table[@id='1234']//tr[1]/th")).size();
		System.out.println(HeadColSize);	//3
	}
}
