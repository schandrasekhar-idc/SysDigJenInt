package objectRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import credentials.SysDig_ElementLocators;
import credentials.SysDig_loginProperties;

public class SysDig_UsersPage extends SysDig_ElementLocators
{	
	
	
	//constructor
	public SysDig_UsersPage(WebDriver SysDig)
	{
		super(SysDig);
		
	}
	
	public WebElement SysDig_Home()
	{
		return SysDig.findElement(Home);
	}
	
	public WebElement SysDig_AccessUsersModule()
	{
		return SysDig.findElement(Users);
	}
	
	
	public void SysDig_AddUsers() throws InterruptedException, IOException
	{
		SysDig_loginProperties lp = new SysDig_loginProperties(SysDig);
		
		//Access Users module
		SysDig_AccessUsersModule().click();
		
		//Click "Add New" button
		SysDig.findElement(AddNewUser).click();
		
		//Wait 10 seconds before entering user name/email
		Thread.sleep(10000);
		
		//Enter new user Email address
		SysDig.findElement(AddUserEmail).sendKeys(lp.usernameValue(1,0,0));
		
		//Enter new user First Name
		SysDig.findElement(AddUserFirstName).sendKeys(lp.usernameValue(0,2,0));
		
		//Enter new user Last Name
		SysDig.findElement(AddUserLastName).sendKeys(lp.usernameValue(0,0,3));
		System.out.println("See OK");
		//Click "OK" on Add User modal
		SysDig.findElement(AddUserOK).click();
		System.out.println("OK clicked");
		
		Thread.sleep(20000);
		
		WebElement SuccessMsg = SysDig.findElement(AddUserModalSuccess);
		WebElement CreatedSuccessMsg = SysDig.findElement(AddUserModalCreatedSuccessMsg);
		String SuccessMsgText = SuccessMsg.getText();
		
		if(SuccessMsgText.length()!=0)
		{
			System.out.println(SuccessMsgText);
			System.out.println(CreatedSuccessMsg);
			
		}
		else
		{
			System.out.println("No SuccessMsgText");
		}
		
		
		
		//Click "Close" button on success modal
		SysDig.findElement(AddUserClose).click();
		
		
		
	}
	
	public void CreatedUsers()
	{
		
	}
	 
	public void SysDig_DelUsers() throws InterruptedException, IOException
	{
		SysDig_loginProperties lp = new SysDig_loginProperties(SysDig);
		
		//Access Users module
		SysDig_AccessUsersModule().click();
		
		//click Deactivate link
		
		//Click "Add New" button
		SysDig.findElement(AddNewUser).click();
		
		//Wait 10 seconds before entering user name/email
		Thread.sleep(10000);
		
		//Enter new user Email address
		SysDig.findElement(AddUserEmail).sendKeys(lp.usernameValue(1,0,0));
		
		//Enter new user First Name
		SysDig.findElement(AddUserFirstName).sendKeys(lp.usernameValue(0,2,0));
		
		//Enter new user Last Name
		SysDig.findElement(AddUserLastName).sendKeys(lp.usernameValue(0,0,3));
		System.out.println("See OK");
		//Click "OK" on Add User modal
		SysDig.findElement(AddUserOK).click();
		System.out.println("OK clicked");
		
		Thread.sleep(20000);
		
		WebElement SuccessMsg = SysDig.findElement(AddUserModalSuccess);
		WebElement CreatedSuccessMsg = SysDig.findElement(AddUserModalCreatedSuccessMsg);
		String SuccessMsgText = SuccessMsg.getText();
		
		if(SuccessMsgText.length()!=0)
		{
			System.out.println(SuccessMsgText);
			System.out.println(CreatedSuccessMsg);
			
		}
		else
		{
			System.out.println("No SuccessMsgText");
		}
		
		
		
		//Click "Close" button on success modal
		SysDig.findElement(AddUserClose).click();
		
		
		
	}
	
	
	
	

}
