package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.SysDig_LoginPage;
import objectRepository.SysDig_HomePage;
import objectRepository.SysDig_PartnersPage;

public class SysDig_ApplicationPartners 
{
	
	
		
	@Test
	public void TC_MyProfile() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C://sarath_eclipse//sarath_eclipse_jars//chromedriver_win32//chromedriver.exe");
		WebDriver SysDig = new ChromeDriver();
		
		
		//maximize browser
		SysDig.manage().window().maximize();
		
		SysDig.get("https://uat-cisco-mca-tool-2018.webappuat.com/home/signin");
		
		
		//access objectRepository package classes
		SysDig_LoginPage SysDig_LP = new SysDig_LoginPage(SysDig);
		
		//wait statement and
		//constructor for SysDig_ElementLocators
			
		
		//access SysDig_Email() and give Username value
		SysDig_LP.SysDig_Email().sendKeys("schandrasekhar@idc.com");
		
	 	
		
		Thread.sleep(20000);
		//access SysDig_Password() and give Password value
		SysDig_LP.SysDig_Password().sendKeys("Test1234!");
		
		//access SysDig_SignIn() and click SignIn button
		SysDig_LP.SysDig_SignIn().click();
		
		//=====================================================================================================================
		
		//access objectRepository class - SysDig_HomePage
		SysDig_HomePage SysDig_HP = new SysDig_HomePage(SysDig);
		
		//wait 20 seconds
		Thread.sleep(16000);
		
		//click on Home link
		SysDig_HP.SysDig_Home().click();
		
				
		//=====================================================================================================================
		
		//access objectRepository class - SysDig_PartnersPage
		SysDig_PartnersPage SysDig_Part = new SysDig_PartnersPage(SysDig);
		
		//wait 20 seconds
		Thread.sleep(20000);
				
		//click on Partners
		SysDig_Part.SysDig_Partners().click();
		
		//wait  10 mseconds
		Thread.sleep(10000); //time in milliseconds
		
		//click on Compliance
		//SysDig_Part.SysDigCompliance().click();
		
		//click on Edit
		SysDig_Part.SysDigEdit().click();
		
		
		
		
		
		
		
		
		
	}
	
		

}
