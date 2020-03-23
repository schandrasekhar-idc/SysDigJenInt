package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.SysDig_ElementLocators;

public class SysDig_ManageTemplatePage extends SysDig_ElementLocators
{	
	
	
	//constructor
	public SysDig_ManageTemplatePage(WebDriver SysDig)
	{
		super(SysDig);
		
	}
	
	public WebElement SysDig_Home()
	{
		return SysDig.findElement(Home);
	}
	
	public WebElement SysDig_ManageTemplate()
	{
		return SysDig.findElement(ManageTemplate);
	}
	
	
	
	
	

}
