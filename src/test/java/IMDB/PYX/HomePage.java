package IMDB.PYX;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.CreateAccPG;
import pageObject.LandingPage;
import pageObject.UserPage;
import pageObject.Watchlist;
import resource.Base;

public class HomePage extends Base{
	@BeforeTest
	public void innitialize() throws IOException {
		driver = InitializeDriver();

	}
		@Test
		public void homePageTest() {
	    driver.get(prop.getProperty("url"));
		LandingPage ln=new LandingPage(driver);
		ln.getSignIn().click();
		ln.clickCreateAC().click();
		
	    //When the account is created and need to log in
		//ln.signinImdb().click();
		
		CreateAccPG ac= new CreateAccPG(driver);
		ac.enterName().sendKeys("TanTest122");
		ac.enterEmail().sendKeys("tanjimnahermitu@gmail.com");
		ac.enterPass().sendKeys("@Mitu123");
		ac.reEnterPass().sendKeys("@Mitu123");
		ac.clickSubmit().click();
		System.out.println("Account is created");
		
		UserPage up=new UserPage(driver);
		up.searchMovie().sendKeys("Jumanji: Welcome to the Jungle 2017");
		up.clickOnMovie().click();
		up.addWatchlist().click();
		up.searchMovie().sendKeys("Avatar: The Last Airbender");
		up.clickOnMovie2().click();
		up.addWatchlist().click();
		System.out.println("Movies are added to watchlist");
		
		Watchlist wl= new Watchlist(driver);
		wl.clickWatchlist().click();
		//To sort the watchlist based on IMDB rating
		Select s= new Select(wl.clickSortList());
		s.selectByValue("USER_RATING");
		wl.RemoveMovie().click();
		System.out.println("Removed the 1st movie from watchlist");
		
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	

}
