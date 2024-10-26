package org.selenium_project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot_Concept {
	
public static void main (String [] args) throws InterruptedException, IOException
	
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/mac/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.get("https://yopmail.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination =  new File("/Users/mac/eclipse-workspace/Selenium/TakeScreenshot/yop.png");
		
		FileUtils.copyFile(source, destination);
		
		
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//input[@class='ycptinput']"));
		ele1.sendKeys("avinash4@yopmail.com");
		
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//button[@class='md']"));
		ele2.click();
		
		
		driver.close();
		
		driver.quit();
		
		System.out.println();
		
		System.out.println(" Automation Program Executed successfully !!!  ");
		
		
		
		
		
	}

}
