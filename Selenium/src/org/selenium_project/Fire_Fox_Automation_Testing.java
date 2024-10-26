package org.selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Fire_Fox_Automation_Testing {
	
	public static void main (String [] args) throws InterruptedException
	
	{
		
		System.setProperty("webdriver.gecko.driver", 
				
				"/Users/mac/eclipse-workspace/Selenium/Driver/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		
		 Thread.sleep(3000);
	     driver.manage().window().maximize();
	     
	     Thread.sleep(3000);
	     driver.navigate().to("https://ticketnew.com/movies/chennai");
	     
//	     Thread.sleep(2000);
//	     driver.navigate().refresh();
//	     
//	     Thread.sleep(2000);
//	     driver.navigate().back();
//	     
//	     Thread.sleep(2000);
//	     driver.navigate().forward();
	}

}
