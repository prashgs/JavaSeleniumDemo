package Selenium.ElementMaps;

import org.openqa.selenium.By;

public class StarWarsFilmsPageElementMap 
{
	protected By aVideos = By.xpath("//ul[@id='section-links']//a[@href='/video']");
	protected By aFilms = By.xpath("//ul[@id='section-links']//a[@href='/films']");
	protected By aStarWarsLogo = By.xpath("//a[@id='nav-sw-logo']");
	protected By title = By.xpath("//title[.='Star Wars Movies | StarWars.com']");

}
