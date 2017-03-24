package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ObjectRepository.GmailLoginOR;

public class GmailUsernamePage {
	
	public WebDriver driver=null;
	
	public By Usernameid = By.id("Email");
	
	public GmailUsernamePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public GmailPasswordPage userNameInfo() throws InterruptedException
	{
		driver.findElement(Usernameid).sendKeys("kkapoor84@gmail.com");  //if locators are defined in the same class
		driver.findElement(By.id(GmailLoginOR.nextButtonId)).click();    //When Locators are defined in another class
		return new GmailPasswordPage(driver);
	}
}
