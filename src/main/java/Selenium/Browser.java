package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Browser 
{
	public static WebDriver Driver;
	
	public static WebDriver Init(String browser)
	{
        try
        {
            switch (browser)
            {
                case "chrome":
                default:
                	String path= System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
                	System.setProperty("webdriver.chrome.driver", path);
                	Driver = new ChromeDriver();
                    break;
            }
        }
        catch (Exception ex)
        {
            Driver = null;
        }
		return Driver;
	}
	
	public static void Dispose()
	{
		if(Driver!=null)
		{
			Driver.quit();
		}
	}

}
