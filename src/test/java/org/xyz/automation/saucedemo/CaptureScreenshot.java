package org.xyz.automation.saucedemo;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{

	
	
	public static void testresults(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot  ts = (TakesScreenshot) driver;  //take screenshot
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./screenshot/sprint1/" + name + ".png");
		
	//	String loc = "Hyderabad";
		
	//	System.out.println("I live in " + loc + " this is IT City");
		
		FileUtils.copyFile(f, fd);
	}
	
}
