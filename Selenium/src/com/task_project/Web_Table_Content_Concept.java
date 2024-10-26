package com.task_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table_Content_Concept {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/mac/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.w3schools.com/html/html_tables.asp");
//		Thread.sleep(2000);
//		
//		System.out.println(" >>>>>>>>>>>>>>>>>> All Data <<<<<<<<<<<<<<<<<<<");
//		
//		List<WebElement> all_Data = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody"));
//		
//		for (WebElement all : all_Data) {
//			
//			System.out.println(all.getText());
//			
//		}
//		
//		System.out.println();
//		
//		
//		System.out.println(" >>>>>>>>>>>>> Row Data <<<<<<<<<<<<<<");
//		
//		List<WebElement> row_Data = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr[5]"));
//		
//		for (WebElement row : row_Data) {
//			
//			System.out.println(row.getText());
//			
//		}
//		
//		
//		System.out.println();
//		
//		System.out.println(" >>>>>>>>>>>>> Column Data <<<<<<<<<<<<<<<");
//		
//		List<WebElement> col_Data = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr/td[3]"));
//		
//		for (WebElement col : col_Data) {
//			
//			System.out.println(col.getText());
//			
//		}
//		
//		System.out.println();
//		
//		System.out.println(" >>>>>>>>>>>>> Specific Data  <<<<<<<<<<<<<<<");
//		
//		
//		List<WebElement> specific_Data = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr[4]/td[3]"));
//		
//		for (WebElement specific : specific_Data) {
//			
//			System.out.println(specific.getText());
//			
//		}
//		
//		System.out.println(" Automation Program Executed Successfully !!! ");
		
		
	}

}
