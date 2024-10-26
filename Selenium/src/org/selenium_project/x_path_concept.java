package org.selenium_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class x_path_concept {
	
	public static void main (String [] args) throws InterruptedException
	
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/mac/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.get("https://yopmail.com/");
		
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//input[@class='ycptinput']"));
		ele1.sendKeys("avinash4@yopmail.com");
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.visibilityOf(ele1));
		
		
		
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//button[@class='md']"));
		ele2.click();
		
		
		driver.close();
		
		driver.quit();
		
		System.out.println();
		
		System.out.println(" Automation Program Executed successfully !!!  ");
		
		
		
		
		
	}

}
