package Selenium.Pages;

import Selenium.ElementMaps.StarWarsFilmsPageElementMap;

public class StartWarsFilmsPage extends StarWarsFilmsPageElementMap
{
	public boolean IsAt()
	{
		return Selenium.Helpers.Element.FindElementAfterWait(title) != null?
				true: false;
	}
	
	public void GoTo(String page)
	{
		switch(page.toLowerCase())
		{
		case "home":
			Selenium.Helpers.Element.FindElementAfterWait(aStarWarsLogo).click();
			break;
		case "video":
			Selenium.Helpers.Element.FindElementAfterWait(aVideos).click();
			break;
		}
	}
}
