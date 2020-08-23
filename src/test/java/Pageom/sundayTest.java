package Pageom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sundayTest {
	
	@Test
	public void rahul()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		sunday sd=new sunday(driver);
		sd.clickcheck();
		sd.putname();
		driver.close();
		
		
	}

}
