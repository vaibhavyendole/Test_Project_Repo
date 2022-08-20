package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_get_all_Data_In_Col {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Jordan\\Desktop\\Extra\\Testing1\\HTML\\Table.html");
		
			for (int i = 1; i <=4; i++)	// No of Rows
			{					
			if(i==1) 	//for Header
			{
				String HeaderText = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/th[1]")).getText();
				System.out.println(HeaderText);
			}
			else		//for Body
			{
				String bodyText = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/td[1]")).getText();
				System.out.println(bodyText);
			}
	
			
			
			}}}




//for(int i=1; i<=5; i++)
//{
//	System.out.print();
//	
//	for(int j=0; J<=4;j++)
//	{
//		
//	}
//	System.out.println();
//}





















