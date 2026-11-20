package org.wipro.sel_auto.rediff.baselayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.sel_auto.rediff.utilitieslayer.ConfigDataProperteis;

public class InitiateBrowser 
{

	public WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() throws Exception
	{
		if(ConfigDataProperteis.readconfigdata("BrowserName").equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(ConfigDataProperteis.readconfigdata("BrowserName").equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if(ConfigDataProperteis.readconfigdata("BrowserName").equalsIgnoreCase("Safari"))
		{
			driver = new SafariDriver();
		}
		
		else
		{
			driver = new ChromeDriver();
		}
		
		driver.get(ConfigDataProperteis.readconfigdata("ApplicationURL"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
	@AfterMethod
	public void closebrowser()
	{
		//driver.quit();
	}
	
}
