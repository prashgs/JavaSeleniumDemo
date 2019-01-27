package Selenium.Tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Selenium.Pages.StarWarsHomePage;
import Selenium.Pages.StartWarsFilmsPage;
import Selenium.Pages.StartWarsVideosPage;
import Selenium.Browser;

public class StartWarsTest 
{
	private String baseUrl="https://www.starwars.com/";
	
  @Test(priority=1)
  public void AtHomePage() 
  {
	  Browser.Driver.get(baseUrl);
	  StarWarsHomePage homepage = new StarWarsHomePage();
	  Assert.assertTrue(homepage.IsAt());
	  Assert.assertTrue(homepage.IsStarWarsLogPresent());
  }

  @Test(priority=2)
  public void NavigateFromHomePageToFilmsPageToVideosPage() 
  {
	  Browser.Driver.get(baseUrl);
	  StarWarsHomePage homepage = new StarWarsHomePage();
	  Assert.assertTrue(homepage.IsAt());
	  homepage.GoTo("films");
	  StartWarsFilmsPage filmsPage= new StartWarsFilmsPage();
	  Assert.assertTrue(filmsPage.IsAt());
	  filmsPage.GoTo("video");
	  StartWarsVideosPage videosPage= new StartWarsVideosPage();
	  Assert.assertTrue(videosPage.IsAt());
  }
    
  @Test(priority=3)
  public void NavigateFromFilmsPageToHomePage() 
  {
	  Browser.Driver.get( baseUrl+"films");
	  StartWarsFilmsPage filmsPage= new StartWarsFilmsPage();
	  Assert.assertTrue(filmsPage.IsAt());
	  filmsPage.GoTo("home");
	  StarWarsHomePage homepage = new StarWarsHomePage();
	  Assert.assertTrue(homepage.IsAt());	  
  }
  
  @Test(priority=4)
  public void NavigateFromVideosPageToHomePage() 
  {
	  Browser.Driver.get( baseUrl+"video");
	  StartWarsVideosPage videosPage= new StartWarsVideosPage();
	  Assert.assertTrue(videosPage.IsAt());
	  videosPage.GoTo("home");
	  StarWarsHomePage homepage = new StarWarsHomePage();
	  Assert.assertTrue(homepage.IsAt());	  
  }
  
  @Test(priority=5)
  public void InvalidUrl() 
  {
	  Browser.Driver.get("https://wwww.starwarss.com");
	  StarWarsHomePage homepage = new StarWarsHomePage();
	  Assert.assertFalse(homepage.IsAt());	  
  }
  
  @BeforeTest(alwaysRun = true)
  public void setUp() throws Exception {
    Browser.Init("chrome");
    Browser.Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Browser.Driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() 
  {
	  Browser.Dispose();
  }
}
