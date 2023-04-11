package Tests;
import org.testng.Assert;
import org.testng.annotations.*;

import Base.BaseTest;
import DriversFactory.driversFactory;
import PageObjects.GoogleSearchPage;

public class SVGElementTest extends BaseTest{

	private GoogleSearchPage gpage;
	
	@Test(priority=0)
	public void testSVGGoogle()
	{
		gpage = new GoogleSearchPage(driversFactory.getDriver());
		System.out.println("thread id-->" + Thread.currentThread().getId());
		
	}
	
	@Test(priority=1)
	public void verifyPageTitle()
	{
		Assert.assertEquals(gpage.pageTitle(), gpage.pageTitle());	
	}
	
	@Test(priority=2)
	public void searchText()
	{
	//	gpage.searchInGoogle("India Population");
		gpage.byLocatorSearch("India Population");	
	}
	
	@Test(priority=3)
	public void verify2ndCommit()
	{
	//	gpage.searchInGoogle("India Population");
		gpage.byLocatorSearch("verify second commit");	
	}
	
}
