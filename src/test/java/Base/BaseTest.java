package Base;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import DriversFactory.driversFactory;
import configReader.readConfigFile;

public class BaseTest extends driversFactory{

	public readConfigFile read;
	public Properties prop; 
	public driversFactory factory;
	public WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		read = new readConfigFile();
		prop = read.readConfigData();
		
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		System.out.println(browser);
		factory = new driversFactory();
		driver = factory.initializeDriver(browser, url);
	}
	
	
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
