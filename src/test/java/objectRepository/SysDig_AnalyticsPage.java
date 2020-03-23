package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.SysDig_ElementLocators;

public class SysDig_AnalyticsPage extends SysDig_ElementLocators
{	
	
	
	//constructor
	public SysDig_AnalyticsPage(WebDriver SysDig)
	{
		super(SysDig);
		
	}
	
	public WebElement SysDig_Home()
	{
		return SysDig.findElement(Home);
	}
	
	public WebElement SysDig_Analytics()
	{
		return SysDig.findElement(Analytics);
	}
	
	
	
	
	

}
