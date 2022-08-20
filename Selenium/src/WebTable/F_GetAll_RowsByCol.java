package WebTable;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F_GetAll_RowsByCol {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Jordan\\Desktop\\Extra\\Testing1\\HTML\\Table.html");
		
		//int RN = driver.findElement(By.xpath("//table[@id='1234']//tr")).size();
		//int RC = driver.findElement(By.xpath("//table[@id='1234']//tr[2]/td")).size();
		
		// You can use RN and RC at i<= RN; j<=RC
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=3;j++)
			{
				if(i==1)
				{
					String text1 = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/th["+j+"]")).getText();
					System.out.print(text1+" ");
				}
				else
				{
					 String text2 = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/td["+j+"]")).getText();
					 System.out.print(text2+" ");
				}		
			}
			System.out.println();
		}
	}
}
