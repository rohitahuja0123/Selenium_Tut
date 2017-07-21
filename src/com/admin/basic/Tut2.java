package com.admin.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tut2	
	{
	
	WebDriver driver;
	
	JavascriptExecutor jse;
	
	public void invokeBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\z5045034\\Downloads\\selenium\\chromedriver.exe" );
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://www.google.co");
			searchPage();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void searchPage()
		{
			// Login 
			
			try {
				driver.findElement(By.id("cred_userid_inputtext")).sendKeys("z5045034@ad.unsw.edu.au");
				driver.findElement(By.id("cred_password_inputtext")).sendKeys("xxxxx");
				
				//driver.findElement(By.name("cred_keep_me_signed_in_checkbox")).click();
				
				// Logged In
				
				Thread.sleep(2000);
				
				driver.findElement(By.id("cred_sign_in_button")).click();
				
				// Scroll Down
				

				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	public static void main(String[] args)
	{
		
		Tut2 myObj = new Tut2();
		myObj.invokeBrowser();
	}

}	
	