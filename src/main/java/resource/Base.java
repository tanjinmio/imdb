package resource;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;






public class Base{
	public static WebDriver driver = null; // static will help you to maintain only one copy in entire framework//
	public Properties prop;

	public WebDriver InitializeDriver() throws IOException {
		prop = new Properties();
		// System.getProperty("user.dir")
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resource\\data.properties");
		prop.load(fis);

		String browserName = prop.getProperty("Browser"); // To give browser name through TestNg//
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\resource\\chromedriver.exe");
		driver= new ChromeDriver();
		}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;

			
		
		
	}
	}
