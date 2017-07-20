package com.admin.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class Timesheet_rohit	
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
			driver.findElement(By.id("cred_userid_inputtext")).sendKeys("z5045034@ad.unsw.edu.au");
			driver.findElement(By.id("cred_password_inputtext")).sendKeys("syd##2015");
			
			//driver.findElement(By.name("cred_keep_me_signed_in_checkbox")).click();
			
			// Logged In
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("cred_sign_in_button")).click();
			
			// Scroll Down
			

			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.get("https://unsw.sharepoint.com/sites/pwa/_layouts/15/pwa/Timesheet/MyTSSummary.aspx");
		
		driver.get("https://unsw.sharepoint.com/sites/pwa/Timesheet.aspx?tsUID=111f34a4-286c-e711-80d0-00155dec4809&Source=https://unsw.sharepoint.com/sites/pwa/_layouts/15/pwa/Timesheet/MyTSSummary.aspx");
				
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl40_g_e265d061_1044_4ee6_b32f_f44eb6d0576b_TimesheetPartJSGridControl_leftpane_mainTable']/tbody/tr[4]/td[2]/div/input")).click();
		
		// Fill Hours 
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl40_g_e265d061_1044_4ee6_b32f_f44eb6d0576b_TimesheetPartJSGridControl_rightpane_mainTable']/tbody/tr[6]/td[4]")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl40_g_e265d061_1044_4ee6_b32f_f44eb6d0576b_TimesheetPartJSGridControl_rightpane_mainTable']/tbody/tr[6]/td[4]")).sendKeys(Keys.values());
		
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl40_g_e265d061_1044_4ee6_b32f_f44eb6d0576b_TimesheetPartJSGridControl_rightpane_mainTable']/tbody/tr[6]/td[5]")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl40_g_e265d061_1044_4ee6_b32f_f44eb6d0576b_TimesheetPartJSGridControl_rightpane_mainTable']/tbody/tr[6]/td[5]")).sendKeys(Keys.values());
		
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl40_g_e265d061_1044_4ee6_b32f_f44eb6d0576b_TimesheetPartJSGridControl_rightpane_mainTable']/tbody/tr[6]/td[6]")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl40_g_e265d061_1044_4ee6_b32f_f44eb6d0576b_TimesheetPartJSGridControl_rightpane_mainTable']/tbody/tr[6]/td[6]")).sendKeys(Keys.values());
		
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl40_g_e265d061_1044_4ee6_b32f_f44eb6d0576b_TimesheetPartJSGridControl_rightpane_mainTable']/tbody/tr[6]/td[7]")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl40_g_e265d061_1044_4ee6_b32f_f44eb6d0576b_TimesheetPartJSGridControl_rightpane_mainTable']/tbody/tr[6]/td[7]")).sendKeys(Keys.values());
		
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl40_g_e265d061_1044_4ee6_b32f_f44eb6d0576b_TimesheetPartJSGridControl_rightpane_mainTable']/tbody/tr[6]/td[8]")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl40_g_e265d061_1044_4ee6_b32f_f44eb6d0576b_TimesheetPartJSGridControl_rightpane_mainTable']/tbody/tr[6]/td[8]")).sendKeys(Keys.values());
		
		// Submit 
		
		driver.findElement(By.xpath("//*[@id='Ribbon.ContextualTabs.TiedMode.Home.Sheet.SubmitMenu-Large']/span[2]")).click();
		
		jse=(JavascriptExecutor)driver;
		jse.executeScript("scroll(0,100)");
		// Turn in final 
		
		//driver.findElement(By.xpath("//*[@id='Ribbon.ContextualTabs.TiedMode.Home.Sheet.SubmitTimesheet-Menu32']/span[4]")).click();

			
		
		// Under Course Catalogue 
		
		//courseCatalogue();	
	}
	


	public static void main(String[] args)
	{
		
		Timesheet_rohit myObj = new Timesheet_rohit();
		myObj.invokeBrowser();
	}

}
