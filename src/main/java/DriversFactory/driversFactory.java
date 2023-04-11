package DriversFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driversFactory {

	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	
	public WebDriver driver;
	
	public WebDriver initializeDriver(String browser, String url)
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		switch(browser)
		{
		case "chrome"  :  driver = new ChromeDriver();
		tdriver.set(driver);
		break;
		
		case "firefox" :  driver = new FirefoxDriver();
		tdriver.set(driver);
		break;
		
		}
		
		getDriver().get(url);
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	
	public static WebDriver getDriver()
	{
		return tdriver.get();
		
	}
	
}
