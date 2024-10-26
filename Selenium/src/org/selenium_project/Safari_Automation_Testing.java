package org.selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari_Automation_Testing {
	
	public static void main (String [] args) throws InterruptedException
	
	{
		WebDriver driver = new SafariDriver();

       
		Thread.sleep(3000);
        driver.get("https://www.google.com");
        
        Thread.sleep(3000);
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        driver.navigate().refresh();
        
        Thread.sleep(3000);
        driver.navigate().to("https://www.instagram.com");
        
       
        
        System.out.println(" Program Executed Successfully !!! ");

       
	}

}
