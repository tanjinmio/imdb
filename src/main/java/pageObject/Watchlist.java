package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Watchlist {
public WebDriver driver;
	
	By WatchList= By.xpath("//*[@id=\"imdbHeader-navDrawerOpen--desktop\"]/div");
	By selectSortBy= By.id("lister-sort-by-options");
	By removie=By.xpath("//div[@title='Click to remove from watchlist']");
	
	
	
	public Watchlist(WebDriver driver) {
		this.driver=driver;
	}
	

	public WebElement clickWatchlist() {
		return driver.findElement(WatchList);
	}
	
	public WebElement clickSortList() {
		return driver.findElement(selectSortBy);
	}
	
	public WebElement RemoveMovie() {
		return driver.findElement(removie);
	}
}
