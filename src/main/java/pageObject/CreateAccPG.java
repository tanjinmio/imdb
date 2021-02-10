package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccPG {

public WebDriver driver;
	
	By name= By.id("ap_customer_name");
	By email= By.name("email");
	By pass= By.xpath("//*[@name='password']");
	By reEnterPass= By.xpath("//*[@name='passwordCheck']");
	By submit = By.cssSelector("[id='signInSubmit']");
	
	
	public CreateAccPG(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement enterName() {
		return driver.findElement(name);
	}
	
	public WebElement enterEmail() {
		return driver.findElement(email);
	}
	
	public WebElement enterPass() {
		return driver.findElement(pass);
	}
	
	public WebElement reEnterPass() {
		return driver.findElement(reEnterPass);
	}
	
	public WebElement clickSubmit() {
		return driver.findElement(submit);
	}
	

}

