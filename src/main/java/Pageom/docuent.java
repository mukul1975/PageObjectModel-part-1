package Pageom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class docuent {
	 WebDriver driver;
	By radio=By.xpath("//input[@value='radio1']");
	By suggession=By.xpath("//input[@placeholder='Type to Select Countries']");
	By selecttor=By.xpath("//select[@name='dropdown-class-example']");
	By check=By.cssSelector("input[value='option1']");
	
	
	public docuent(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void radiobutton()
	{
		driver.findElement(radio).click();
	}
	public void putSuggerssion()
	{
		driver.findElement(suggession).sendKeys("Bangladesh");
	}
	
	public void itemselect(String opt)
	{
		Select sc=new Select(driver.findElement(selecttor));
		sc.selectByVisibleText(opt);
	}
	public void getvalue()
	{
		System.out.println(driver.findElement(suggession).getAttribute("value"));
	}
	
	public void checkbox()
	{
		driver.findElement(check).click();
	}
	
}
