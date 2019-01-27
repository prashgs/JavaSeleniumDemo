package Selenium.Pages;

import Selenium.ElementMaps.StarWarsVideosPageElementMap;

public class StartWarsVideosPage extends StarWarsVideosPageElementMap
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
		case "films":
			Selenium.Helpers.Element.FindElementAfterWait(aFilms).click();
			break;
		}
	}
}
