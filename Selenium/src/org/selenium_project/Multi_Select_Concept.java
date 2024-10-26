package org.selenium_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select_Concept {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/mac/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://demoqa.com/select-menu");
		
		WebElement multi_select = driver.findElement(By.xpath("//select[@id='cars']"));
		
		Select s = new Select(multi_select);
		
		boolean multiple = s.isMultiple();
		System.out.println("Is this a Multiple Select - true (or) false: "+multiple);
		
		System.out.println();
		
		
		List<WebElement> All_Options = s.getOptions();
		
		for( WebElement all: All_Options)
			
		{
			System.out.println(all.getText());
		}
		
//		Thread.sleep(2000);
//		s.selectByIndex(3);
//		
//		Thread.sleep(2000);
//		s.selectByIndex(1);
//		
//		Thread.sleep(2000);
//		s.selectByIndex(4);
		
		
		System.out.println();
		
		System.out.println(" Automation Program Executed Successfully !!! ");
		
		
		
	}

}
