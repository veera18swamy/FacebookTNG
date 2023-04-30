package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
	public static WebDriver driver;
	
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	public void openUrl(String input1)
	{
		driver.get(input1);
	}
	

}
