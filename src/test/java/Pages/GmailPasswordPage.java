package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ObjectRepository.GmailLoginOR;

public class GmailPasswordPage {
	
	public WebDriver driver=null;
	
		
	public GmailPasswordPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void userPasswordInfo() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.id(GmailLoginOR.Passwordid)).sendKeys("07march2005");
		driver.findElement(By.id(GmailLoginOR.Signupid)).click();
	}
}

