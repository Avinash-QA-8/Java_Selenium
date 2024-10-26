package org.selenium_project;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class First_Automation_Project {
	
	

	public static void main (String [] args) throws InterruptedException
	
	{
		
		     System.setProperty("webdriver.chrome.driver", 
		    		 "/Users/mac/eclipse-workspace/Selenium/Driver/chromedriver");
		     
		     WebDriver driver = new ChromeDriver();
		     
		     Thread.sleep(3000);
		     driver.manage().window().maximize();
		     
		     Thread.sleep(3000);
		     driver.get(" https://www.youtube.com/ ");
		        
		     Thread.sleep(3000);
		     driver.navigate().to("https://www.instagram.com/");
		     
		     Thread.sleep(3000);
		     driver.navigate().refresh();
		     
		     Thread.sleep(3000);
		     driver.navigate().back();
		     
		     Thread.sleep(3000);
		     driver.navigate().forward();
		     
	         driver.close();
	     
	         driver.quit();
		     
		     
		     System.out.println(" Program Executed successfully !!! ");
		     
		     

		     
}
	
}
