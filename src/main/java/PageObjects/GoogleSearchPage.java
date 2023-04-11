package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.baseUtils;

public class GoogleSearchPage {

	private WebDriver ldriver;
	baseUtils b;
	
	public GoogleSearchPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
	}
	
	@FindBy(name="q")
	private WebElement searchBar;
	
	By name = By.name("q");
	
	public void searchInGoogle(String text)
	{
	//baseUtils.genericWaitMechanism(ldriver, By.name("q"));
		searchBar.sendKeys(text);
	}
	
	public void byLocatorSearch(String text )
	{
	baseUtils.genericWaitMechanism(ldriver, name);
	 ldriver.findElement(name).sendKeys(text);;
	}
	
	public String pageTitle()
	{
		return ldriver.getTitle();
	}
	
	
}
