package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import credentials.SysDig_ElementLocators;
import objectRepository.SysDig_LoginPage;
import objectRepository.SysDig_ManageTemplatePage;
import objectRepository.SysDig_AnalyticsPage;
import objectRepository.SysDig_CampaignPage;
import objectRepository.SysDig_CustomizeEmailPage;
import objectRepository.SysDig_CustomizeReportPage;
import objectRepository.SysDig_DataMiningPage;
import objectRepository.SysDig_DomainBlacklistPage;
import objectRepository.SysDig_HomePage;
import objectRepository.SysDig_MyProfilePage;
import objectRepository.SysDig_PartnersPage;
import objectRepository.SysDig_URLPage;
import objectRepository.SysDig_UsersPage;

public class SysDig_TC_AdminConsole 
{
	
	
		
	@Test
	public void TC_AdminConsole() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C://sarath_eclipse//sarath_eclipse_jars//chromedriver_win32//chromedriver.exe");
		WebDriver SysDig = new ChromeDriver();
		
		
		//maximize browser
		SysDig.manage().window().maximize();
		SysDig.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		SysDig.get("https://dev-sysdigroi.webappuat.com/admin");
		
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
		
		//wait 20 seconds
		Thread.sleep(20000);
		
		//Return to Console using Menu-Toggle
		SysDig_HP.SysDig_Home().click();
		
		//click on Home link
		SysDig_HP.SysDig_HomeLink().click();
		
		
		//======================================================================================================================
		
		//Campaign - Test
		//access objectRepository class - SysDig_CampaignPage
		SysDig_CampaignPage SysDig_MC = new SysDig_CampaignPage(SysDig);
		
		//wait 20 seconds
		Thread.sleep(20000);
		
		//click on Campaign module
		SysDig_MC.SysDig_Campaign().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
				
		//Return to Console using Menu-Toggle
		SysDig_HP.SysDig_Home().click();
				
		//click on Home link
		SysDig_HP.SysDig_HomeLink().click();
				
				
		//======================================================================================================================
		
		//Users - Test
		//access objectRepository class - SysDig_UsersPage
		SysDig_UsersPage SysDig_U = new SysDig_UsersPage(SysDig);
				
		//wait 20 seconds
		Thread.sleep(20000);
				
		//click on Users module
		SysDig_U.SysDig_AccessUsersModule().click();
		
		
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
						
		//Return to Console using Menu-Toggle
		SysDig_HP.SysDig_Home().click();
						
		//click on Home link
		SysDig_HP.SysDig_HomeLink().click();
						
						
		//======================================================================================================================
				
		//Data Mining - Test
		//access objectRepository class - SysDig_DataMiningPage
		SysDig_DataMiningPage SysDig_DM = new SysDig_DataMiningPage(SysDig);
						
		//wait 20 seconds
		Thread.sleep(20000);
						
		//click on DataMining module
		SysDig_DM.SysDig_DataMining().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
								
		//Return to Console using Menu-Toggle
		SysDig_HP.SysDig_Home().click();
								
		//click on Home link
		SysDig_HP.SysDig_HomeLink().click();
								
								
		//======================================================================================================================
						
		//Analytics - Test
		//access objectRepository class - SysDig_AnalyticsPage
		SysDig_AnalyticsPage SysDig_AN = new SysDig_AnalyticsPage(SysDig);
								
		//wait 20 seconds
		Thread.sleep(20000);
								
		//click on Analytics module
		SysDig_AN.SysDig_Analytics().click();
		
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
										
		//Return to Console using Menu-Toggle
		SysDig_HP.SysDig_Home().click();
										
		//click on Home link
		SysDig_HP.SysDig_HomeLink().click();
										
										
		//======================================================================================================================
								
		//Partners - Test
		//access objectRepository class - SysDig_AnalyticsPage
		SysDig_PartnersPage SysDig_P = new SysDig_PartnersPage(SysDig);
										
		//wait 20 seconds
		Thread.sleep(20000);
										
		//click on Analytics module
		SysDig_P.SysDig_Partners().click();
				
				
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
										
		//Return to Console using Menu-Toggle
		SysDig_HP.SysDig_Home().click();
										
		//click on Home link
		SysDig_HP.SysDig_HomeLink().click();
										
										
		//======================================================================================================================
								
		//URL - Test
		//access objectRepository class - SysDig_AnalyticsPage
		SysDig_URLPage SysDig_URL = new SysDig_URLPage(SysDig);
										
		//wait 20 seconds
		Thread.sleep(20000);
										
		//click on URL module
		SysDig_URL.SysDig_URL().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
												
		//Return to Console using Menu-Toggle
		SysDig_HP.SysDig_Home().click();
												
		//click on Home link
		SysDig_HP.SysDig_HomeLink().click();
												
												
		//======================================================================================================================
										
		//Customize Email - Test
		//access objectRepository class - SysDig_CustomizeEmailPage
		SysDig_CustomizeEmailPage SysDig_CE = new SysDig_CustomizeEmailPage(SysDig);
												
		//wait 20 seconds
		Thread.sleep(20000);
												
		//click on Analytics module
		SysDig_CE.SysDig_CustomizeEmail().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
														
		//Return to Console using Menu-Toggle
		SysDig_HP.SysDig_Home().click();
														
		//click on Home link
		SysDig_HP.SysDig_HomeLink().click();
														
														
		//======================================================================================================================
												
		//Customize Report - Test
		//access objectRepository class - SysDig_CustomizeReportPage
		SysDig_CustomizeReportPage SysDig_CR = new SysDig_CustomizeReportPage(SysDig);
														
		//wait 20 seconds
		Thread.sleep(20000);
														
		//click on CustomizeReport module
		SysDig_CR.SysDig_CustomizeReport().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
																
		//Return to Console using Menu-Toggle
		SysDig_HP.SysDig_Home().click();
																
		//click on Home link
		SysDig_HP.SysDig_HomeLink().click();
																
																
		//======================================================================================================================
														
		//Domain Blacklist - Test
		//access objectRepository class - SysDig_DomainBlacklistPage
		SysDig_DomainBlacklistPage SysDig_DB = new SysDig_DomainBlacklistPage(SysDig);
																
		//wait 20 seconds
		Thread.sleep(20000);
																
		//click on Domain Blacklist module
		SysDig_DB.SysDig_DomainBlacklist().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
																		
		//Return to Console using Menu-Toggle
		SysDig_HP.SysDig_Home().click();
																		
		//click on Home link
		SysDig_HP.SysDig_HomeLink().click();
																		
																		
		//======================================================================================================================
																
		//Manage Template - Test
		//access objectRepository class - SysDig_ManageTemplate
		SysDig_ManageTemplatePage SysDig_MT = new SysDig_ManageTemplatePage(SysDig);
																		
		//wait 20 seconds
		Thread.sleep(20000);
																		
		//click on ManageTemplate module
		SysDig_MT.SysDig_ManageTemplate().click();
		
		//======================================================================================================================
		
		//wait 20 seconds
		Thread.sleep(20000);
												
		//Return to Console using Menu-Toggle
		SysDig_HP.SysDig_Home().click();
												
		//click on Home link
		SysDig_HP.SysDig_HomeLink().click();
												
												
		//======================================================================================================================
		
		
	}
	
	

}
