package Selenium.Pages;

import Selenium.ElementMaps.StarWarsHomePageElementMap;

public class StarWarsHomePage extends StarWarsHomePageElementMap
{

	public StarWarsHomePage()
	{
		// TODO Auto-generated constructor stub
	}
	
	public boolean IsStarWarsLogPresent()
	{
		return Selenium.Helpers.Element.FindElementAfterWait(aFilms)!=null?
				true: false;
	}
	
	public boolean IsAt()
	{
		return Selenium.Helpers.Element.FindElementAfterWait(title) != null?
				true: false;
	}
	
	public void GoTo(String page)
	{
		switch(page.toLowerCase())
		{
		case "video":
			Selenium.Helpers.Element.FindElementAfterWait(aVideos).click();
			break;
		case "films":
			Selenium.Helpers.Element.FindElementAfterWait(aFilms).click();
			break;
		}
	}

}
