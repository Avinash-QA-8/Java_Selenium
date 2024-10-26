package com.task_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Concept {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/mac/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
	
		
//		driver.switchTo().frame(0);
	
//		driver.switchTo().frame("single_frame");
		
		Thread.sleep(2000);
        WebElement frame_1 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
        driver.switchTo().frame(frame_1);
           
        Thread.sleep(2000);
        WebElement frame_2 = driver.findElement(By.xpath("//input[@type='text']"));
        frame_2.sendKeys(" Automation Testing ");
        
        driver.switchTo().parentFrame();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
        
        Thread.sleep(2000);
        WebElement f1 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
        driver.switchTo().frame(f1);
        
        Thread.sleep(2000);
        WebElement f2 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
        driver.switchTo().frame(f2);
        
        WebElement enter_name = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        enter_name.sendKeys(" Testing Field ");
        
        Thread.sleep(2000);
        driver.switchTo().parentFrame();
        
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        
        System.out.println(" came out of the page and now moving to next element ");
        
//        Thread.sleep(2000);
//        WebElement practice_Site = driver.findElement(By.xpath("//a[text()='Practice Site']"));
//        practice_Site.click();
//        
//		
//		System.out.println();
//		
//		System.out.println(" Automation Testing Exeucted Successfully !!!! ");
		
		
		//driver.quit();
		
		
	}

}
