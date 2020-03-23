package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.SysDig_ElementLocators;

public class SysDig_PartnersPage extends SysDig_ElementLocators
{	
	
	
	//constructor
	public SysDig_PartnersPage(WebDriver SysDig)
	{
		super(SysDig);
		
	}
	
	public WebElement SysDig_Home()
	{
		return SysDig.findElement(Home);
	}
	
	public WebElement SysDig_Partners()
	{
		return SysDig.findElement(Partners);
	}
	
	public WebElement SysDigCompliance()
	{
		return SysDig.findElement(Compliance);
	}
	
	public WebElement SysDigEdit()
	{
		return SysDig.findElement(Edit);
	}

	
	
	
	
	
	

}
