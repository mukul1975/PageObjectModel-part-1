package Pageom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class steaveTest {
	
	@Test
	public void parctice()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		docuent dc=new docuent(driver);
		dc.radiobutton();
		dc.putSuggerssion();
		dc.itemselect("Option2");
		dc.checkbox();
		dc.getvalue();
//		driver.close();
		
		sunday sda=new sunday(driver);
		sda.clickcheck();
		sda.putname();
		sda.print();
		driver.close();
		
	}
}
