package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_getData_fromParticularIndex {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Jordan\\Desktop\\Extra\\Testing1\\HTML\\Table.html");
		
		String text = driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[2]")).getText();
		System.out.println(text);	//Manual
		
		//Header
		String HeaderText = driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th[2]")).getText();
		System.out.println(HeaderText);		//BookType
	}
}
