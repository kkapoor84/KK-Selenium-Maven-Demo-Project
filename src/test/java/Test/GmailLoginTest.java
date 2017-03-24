package Test;

import org.testng.annotations.Test;

import Base.DriverSetup;
import Pages.GmailPasswordPage;
import Pages.GmailUsernamePage;

public class GmailLoginTest {
	
	DriverSetup  DSObject =  new DriverSetup();
	GmailUsernamePage GLPObject = new GmailUsernamePage(DSObject.driver);


	
	@Test
	
	public void gmailSingup() throws InterruptedException
	{
	
		GmailPasswordPage pwd= GLPObject.userNameInfo();
		pwd.userPasswordInfo();
		
	}

}
