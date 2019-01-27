package Selenium.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Selenium.Browser;

public final class Element 
{
	public static org.openqa.selenium.WebElement FindElementAfterWait (By elementBy) 
	{
		try
		{
			return new WebDriverWait(Browser.Driver, 20)
					  .until(ExpectedConditions.presenceOfElementLocated(elementBy));
		}
		catch(Exception ex)
		{
			return null;
		}
    }
	
	public static boolean isElementPresent(By by) 
  {
		return FindElementAfterWait(by)!=null? true: false;
  }

}
