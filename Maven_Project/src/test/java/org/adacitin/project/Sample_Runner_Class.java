package org.adacitin.project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adacitin.project.Base_Class;

public class Sample_Runner_Class extends Base_Class {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
	  driver = browser_Launch("chrome");
	  
	  maximize_Window();
	  
	  static_Wait();
	  
	  url_Launch("https://adactinhotelapp.com/index.php");
	  
	  static_Wait();
	  
	  WebElement user_name = driver.findElement(By.xpath("//input[@id='username']"));
	  input(user_name,"stailn08");
	  
	  static_Wait();
	  
	  WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	  input(password,"EEYJ97");
	  
	  static_Wait();
	  
	  screenshot("Login_Page");
	  
	  static_Wait();
	  
	  WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
	  click_Button(login);
	  
	  static_Wait();
	  
	  quit();
	  
	  success_Message();
	}

}
