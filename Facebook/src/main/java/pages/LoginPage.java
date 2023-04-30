package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import base.Base;

public class LoginPage extends Base
{
	By username=By.id("email");
	By password=By.id("pass");
	By loginbtn=By.name("login");
	
	public void Loginpage(String userna,String pass)
	{
		driver.findElement(username).sendKeys(userna);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginbtn).sendKeys(Keys.ENTER);
	
	}
	
}
