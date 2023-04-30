package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.Base;

public class Homepage extends Base
{
	
	public void validHome()
	{
	 	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement w1=driver.findElement(By.xpath("//a[@aria-label='K Veera Swamy']"));
		js.executeScript("arguments[0].click();", w1);
		
	}

}
