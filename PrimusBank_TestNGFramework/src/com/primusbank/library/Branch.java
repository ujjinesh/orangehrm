package com.primusbank.library;

import org.openqa.selenium.By;
//import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Sleeper;

import com.primusbank.constants.PrimusBankConstants;
import com.primusbank.utils.Generics;

public class Branch extends PrimusBankConstants
{

	public String branchname,add1,zipcode,country,state,city;
	
	public boolean createBranch(String brname,String add1,String zip,String country,String state,String city) throws InterruptedException
	{
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys(brname);
		driver.findElement(By.id("txtAdd1")).sendKeys(add1);
		driver.findElement(By.id("txtZip")).sendKeys(zip);
		Sleeper.SYSTEM_SLEEPER.wait(2000);
		Generics.selectItem("//*[@id='lst_counrtyU']", country);
		Sleeper.SYSTEM_SLEEPER.wait(2000);
		Generics.selectItem("//*[@id='lst_stateI']", state);
		Sleeper.SYSTEM_SLEEPER.wait(2000);
		Generics.selectItem("//*[@id='lst_cityI']", city);
		Sleeper.SYSTEM_SLEEPER.wait(2000);
		
		driver.findElement(By.id("btn_insert")).click();
		String msg=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(msg);
		if (msg.toLowerCase().contains("new branch with id")) 
		{
			return true;
		} else 
		{
			return false;
		}
		
	}
	
	
	public boolean createBranch(String brname,String add1,String add2,String zip,String country,String state,String city) throws Throwable
	{
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys(brname);
		driver.findElement(By.id("txtAdd1")).sendKeys(add1);
		driver.findElement(By.id("Txtadd2")).sendKeys(add2);
		driver.findElement(By.id("txtZip")).sendKeys(zip);
		Sleeper.SYSTEM_SLEEPER.wait(2000);
		Generics.selectItem("//*[@id='lst_counrtyU']", country);
		Sleeper.SYSTEM_SLEEPER.wait(2000);
		Generics.selectItem("//*[@id='lst_stateI']", state);
		Sleeper.SYSTEM_SLEEPER.wait(2000);
		Generics.selectItem("//*[@id='lst_cityI']", city);
		Sleeper.SYSTEM_SLEEPER.wait(2000);
		driver.findElement(By.id("btn_insert")).click();
		String msg=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		if (msg.toLowerCase().contains("new branch with id")) 
		{
			return true;
		} else 
		{
			return false;
		}
		
	}
	
}
