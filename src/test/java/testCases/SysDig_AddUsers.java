package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import credentials.SysDig_ElementLocators;
import objectRepository.SysDig_LoginPage;
import objectRepository.SysDig_HomePage;
import objectRepository.SysDig_MyProfilePage;
import objectRepository.SysDig_UsersPage;

public class SysDig_AddUsers 
{
	
	
		
	@Test
	public void TC_AddUsers() throws InterruptedException, IOException
	{
		
		//======================================================================================================
		System.setProperty("webdriver.chrome.driver", "C://sarath_eclipse//sarath_eclipse_jars//chromedriver_win32//chromedriver.exe");
		WebDriver SysDig = new ChromeDriver();
		
		
		//maximize browser
		SysDig.manage().window().maximize();
		SysDig.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		SysDig.get("https://dev-sysdigroi.webappuat.com/Home/SignIn");
		
		//verify page title
		//waitForElementDisplay()
		SysDig_ElementLocators SysDig_EL = new SysDig_ElementLocators(SysDig);
		SysDig_EL.waitAndVerifyTitle();
		
		//access objectRepository package classes
		SysDig_LoginPage SysDig_LP = new SysDig_LoginPage(SysDig);
		
				
		//access SysDig_Email() and give Username value
		SysDig_LP.SysDig_Email().sendKeys("idc.test.adm@webappuat.com");
		
		
		
		//Thread.sleep(20000);
		//access SysDig_Password() and give Password value
		SysDig_LP.SysDig_Password().sendKeys("Test1234!");
		
		//access SysDig_SignIn() and click SignIn button
		SysDig_LP.SysDig_SignIn().click();
		
		//=====================================================================================================================
		
		//access objectRepository class - SysDig_HomePage
		SysDig_HomePage SysDig_HP = new SysDig_HomePage(SysDig);
		
		//wait 20 seconds
		Thread.sleep(20000);
		
		//click on Menu-Toggle
		SysDig_HP.SysDig_Home().click();
		
				
		//=====================================================================================================================
		
		//Users
		//access objectRepository class - SysDig_MyProfile
		SysDig_UsersPage SysDig_AU = new SysDig_UsersPage(SysDig);
		
		
		//wait 20 seconds
		Thread.sleep(20000);
				
		//Add new user in Users module
		SysDig_AU.SysDig_AddUsers();
		
		//======================================================================================================================
		
				
				
		
	}
	
	

}
