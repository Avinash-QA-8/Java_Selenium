package org.selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class My_First_Automation {

	
	public static void main (String [] args)
	
	{
	   
		System.setProperty("webdriver.chrome.driver", 
				
				"/Users/mac/eclipse-workspace/Selenium_Project/Driver/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://in.bookmyshow.com/explore/home/chennai ");
		
		
	}
}
