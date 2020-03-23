package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.SysDig_ElementLocators;

public class SysDig_CampaignPage extends SysDig_ElementLocators
{	
	
	
	//constructor
	public SysDig_CampaignPage(WebDriver SysDig)
	{
		super(SysDig);
		
	}
	
	public WebElement SysDig_Home()
	{
		return SysDig.findElement(Home);
	}
	
	public WebElement SysDig_Campaign()
	{
		return SysDig.findElement(Campaign);
	}
	
	
	
	
	

}
