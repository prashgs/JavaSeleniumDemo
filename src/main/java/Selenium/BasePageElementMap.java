package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageElementMap 
{
	public WebDriver Driver;

    public WebDriverWait wait;
    
	BasePageElementMap()
	{
		this.Driver = Browser.Init("chrome");
		wait = new WebDriverWait(Driver,20);
	}
	

}
