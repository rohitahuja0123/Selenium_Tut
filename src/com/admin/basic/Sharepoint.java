package com.admin.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sharepoint
	{
	
	WebDriver driver;
	
	public void invokeBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\z5045034\\Downloads\\selenium\\chromedriver.exe" );
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://unsw.sharepoint.com/sites/pwa/default.aspx");
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
			driver.findElement(By.id("cred_userid_inputtext")).sendKeys("z5034303@ad.unsw.edu.au");
			driver.findElement(By.id("cred_password_inputtext")).sendKeys("xxxxx");
			
			//driver.findElement(By.name("cred_keep_me_signed_in_checkbox")).click();
			
			// Logged In
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("cred_sign_in_button")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.get("https://unsw.sharepoint.com/sites/pwa/Projects.aspx");
		
		driver.findElement(By.xpath("//*[@id='Ribbon.ContextualTabs.ProjectCenter.Home-title']/a/span[1]")).click();
	
		
		driver.findElement(By.xpath("//*[@id='Ribbon.ContextualTabs.ProjectCenter.Home.Share.ExportExcel-Large']/span[2]")).click();
		
		
		// Under Course Catalogue 
		
		//courseCatalogue();	
	}
	
	//////////////////////////////////////   Debug Below   /////////////////////////////////////////
	/*public void courseCatalogue()	
	{
		driver.findElement(By.name("NS_CRSE_CAT_VW2_INSTITUTION")).sendKeys("UNSWA");
		driver.findElement(By.name("NS_CRSE_CAT_VW2_CRSE_I")).sendKeys("100000");
		
		driver.findElement(By.name("#ICSearch")).click();
	}
	*/

	public static void main(String[] args)
	{
		
		Sharepoint myObj = new Sharepoint();
		myObj.invokeBrowser();
	}

}
