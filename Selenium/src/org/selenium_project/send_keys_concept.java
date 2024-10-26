package org.selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class send_keys_concept {
	
public static void main (String [] args) throws InterruptedException
	
	{
		
		     System.setProperty("webdriver.chrome.driver", 
		    		 "/Users/mac/eclipse-workspace/Selenium/Driver/chromedriver");
		     
		     WebDriver driver = new ChromeDriver();
		     
		     Thread.sleep(3000);
		     driver.manage().window().maximize();
		     
		        
		     Thread.sleep(3000);
		     driver.navigate().to("https://adactinhotelapp.com/");
		     
		     driver.findElement(By.name("username")).sendKeys("avinash8");
		     Thread.sleep(3000);
		     
		     driver.findElement(By.name("password")).sendKeys("Rocket777");
		     Thread.sleep(3000);
		     
		     driver.findElement(By.id("login")).click();
		     Thread.sleep(3000);
		   
	         driver.close();
	     
	         driver.quit();
		    
		     System.out.println(" Program Executed successfully !!! ");
		     
		     

		     
}

}
