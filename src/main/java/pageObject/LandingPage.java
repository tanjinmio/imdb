package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signIn= By.xpath("//div[text()='Sign In']");
	By imdb= By.xpath("//span[text()='Sign in with IMDb']");
	By clickNewAc=By.cssSelector("a.list-group-item.create-account");
	
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	

	
	public WebElement getSignIn() {
		return driver.findElement(signIn);
	}
	public WebElement signinImdb() {
		return driver.findElement(imdb);
	}
	
	public WebElement clickCreateAC() {
		return driver.findElement(clickNewAc);
	}
}
