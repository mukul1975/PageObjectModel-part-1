package Pageom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class sunday {
//	page Object factory
	WebDriver driver;
	@FindBy(id="checkBoxOption2")
	WebElement check1;
	@FindBy(xpath="//input[@name='enter-name']")
	WebElement nameEntry;
	
	public sunday (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickcheck()
	{
		check1.click();
	}
	public void putname()
	{
		nameEntry.sendKeys("Alam");
	}
	
	public void print()
	{
		System.out.println(driver.getTitle());
	}
	
	
	
	
	
}
