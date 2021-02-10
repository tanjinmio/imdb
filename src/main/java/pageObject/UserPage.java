package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserPage {
public WebDriver driver;
	
	By search= By.cssSelector("#suggestion-search");
	By clickMovie= By.xpath("//div[text()='Jumanji: Welcome to the Jungle']");
	By clickMovie2=By.xpath("//div[text()='Avatar: The Last Airbender']");
	By watchList= By.xpath("//div[@title='Click to add to watchlist']");
	
	
	public UserPage(WebDriver driver) {
		this.driver=driver;
	}
	

	public WebElement searchMovie() {
		return driver.findElement(search);
	}
	
	public WebElement clickOnMovie() {
		return driver.findElement(clickMovie);
	}
	
	public WebElement clickOnMovie2() {
		return driver.findElement(clickMovie2);
	}
	
	public WebElement addWatchlist() {
		return driver.findElement(watchList);
	}
	
	
}
