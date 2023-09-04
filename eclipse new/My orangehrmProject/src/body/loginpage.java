package body;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utls.AppUtiles;

public class loginpage extends AppUtiles {

	public void login(String uid,String pwd) {
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
		
		

	}
	
public void isAdminModuleDisplayed() {
	WebElement uv =driver.findElement(By.linkText("Admin"));

	if(uv.isDisplayed())
	{
		System.out.println("pass");
	}else {
		System.out.println("fail");

	}
}
	
	public void logOut() {
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	
	
	public void invalidData(String uid,String pwd) {
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement vu =driver.findElement(By.id("spanMessage"));
		if(vu.isDisplayed())
		{
			System.out.println("Invalid credentials is displayed");

		}else {
			System.out.println("fail");

		}
		
	}
	
public boolean isErrMsgDisplayed() {
		
		String errmsg;
		errmsg=driver.findElement(By.id("spanMessage")).getText();
		if(errmsg.toLowerCase().contains("Invalid"))
		{
			return true;
		}
		return false;
		
	}

public boolean isEmpModuleDisplayed() {

	try {
		driver.findElement(By.linkText("Admin")).isDisplayed();
		return false;
	} catch (Exception e) {

		return false;

	}
}
	
}
