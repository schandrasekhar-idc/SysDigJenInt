package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import credentials.SysDig_ElementLocators;
import objectRepository.SysDig_LoginPage;
import objectRepository.SysDig_HomePage;
import objectRepository.SysDig_MyProfilePage;

public class SysDig_SessionOutTest 
{
	
	
		
	@Test
	public void TC_MyProfile() throws InterruptedException
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
		
		//My Profile - Test
		//access objectRepository class - SysDig_MyProfile
		SysDig_MyProfilePage SysDig_MP = new SysDig_MyProfilePage(SysDig);
		
		
		//wait 20 seconds
		Thread.sleep(20000);
				
		//click on MyProfile module
		SysDig_MP.SysDig_MyProfile().click();
		
		//======================================================================================================================
		
		//wait 30min
		Thread.sleep((long) 1.8e+6); //30 minutes
		
		
		//*[@id="session-timeout-dialog"]
		
		//Return to Console using Menu-Toggle
		SysDig_HP.SysDig_Home().click();
		
		//click on Home link
		//SysDig_HP.SysDig_HomeLink().click();
		
		
				
		
	}
	
	

}
