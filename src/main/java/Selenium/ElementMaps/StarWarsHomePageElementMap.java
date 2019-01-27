package Selenium.ElementMaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import Selenium.BasePageElementMap;
import Selenium.Browser;
import Selenium.Pages.StarWarsHomePage;

public class StarWarsHomePageElementMap
{
	protected By aVideos = By.xpath("//ul[@id='section-links']//a[@href='/video']");
	protected By aFilms = By.xpath("//ul[@id='section-links']//a[@href='/films']");
	protected By aStarWarsLogo = By.xpath("//a[@id='nav-sw-logo']");
	protected By title = By.xpath("//title[.='StarWars.com | The Official Star Wars Website']");
	
}