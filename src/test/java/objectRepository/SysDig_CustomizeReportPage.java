package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.SysDig_ElementLocators;

public class SysDig_CustomizeReportPage extends SysDig_ElementLocators
{	
	
	
	//constructor
	public SysDig_CustomizeReportPage(WebDriver SysDig)
	{
		super(SysDig);
		
	}
	
	public WebElement SysDig_Home()
	{
		return SysDig.findElement(Home);
	}
	
	public WebElement SysDig_CustomizeReport()
	{
		return SysDig.findElement(CustomizeReport);
	}
	
	
	
	
	

}
