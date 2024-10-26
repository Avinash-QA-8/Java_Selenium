package org.selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor_Concept {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/mac/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.get("https://yopmail.com/");
		
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		WebElement yop_mail = driver.findElement(By.xpath("//div[@class='tooltip click']"));
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",yop_mail);
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		
		System.out.println(" Automation Program Executed Successfully !!!! ");
		
		driver.close();
		
		
	}

}
