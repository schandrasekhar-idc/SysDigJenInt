package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import credentials.SysDig_ElementLocators;

public class SysDig_LoginPage extends SysDig_ElementLocators
{
	
	public SysDig_LoginPage(WebDriver SysDig) 
	{
		super(SysDig);
				
	}
	
	
	public WebElement SysDig_Email()
	{		
		//waitForElementDisplay();
		
		
		return SysDig.findElement(Username);		
	}	
	
	
	public WebElement SysDig_Password()
	{
		return SysDig.findElement(Password);
	}
	
	public WebElement SysDig_SignIn()
	{
		return SysDig.findElement(SignIn);
	}
	
	
	

}












