package Testing;

import org.testng.annotations.Test;

import pages.Homepage;
import pages.LoginPage;

public class FacebookTesting 
{
	@Test
	public void validateLogin()
	{
		LoginPage loginpage=new LoginPage();
		Homepage homepage=new Homepage();
		
		loginpage.setup();
		loginpage.openUrl("https://www.facebook.com");
		loginpage.Loginpage("9347283178", "kv95733122");
		try { Thread.sleep(5000);}catch(Exception e) {}
		homepage.validHome();
		
	}

}
