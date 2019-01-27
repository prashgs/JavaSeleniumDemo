package Selenium.ElementMaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;

import Selenium.Browser;

public class StarWarsVideosPageElementMap 
{
	protected By aVideos = By.xpath("//ul[@id='section-links']//a[@href='/video']");
	protected By aFilms = By.xpath("//ul[@id='section-links']//a[@href='/films']");
	protected By aStarWarsLogo = By.xpath("//a[@id='nav-sw-logo']");
	protected By title = By.xpath("//title[contains(text(),'Star Wars Videos and Behind the Scenes Featurettes | StarWar')]");
	
}
