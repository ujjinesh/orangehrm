package body;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utls.AppUtiles;

public class Users extends AppUtiles {
	
	public boolean adduser(String role,String EmployeeName,String Username,String Password  ) throws InterruptedException {
		
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();

		driver.findElement(By.id("btnAdd")).click();
		
		Select userrole = new Select(driver.findElement(By.id("systemUser_userType")));
		userrole.selectByVisibleText(role);
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(EmployeeName);
		driver.findElement(By.id("systemUser_userName")).sendKeys(Username);
		driver.findElement(By.id("systemUser_password")).sendKeys(Password);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(Password);
         
		Thread.sleep(3000);
		
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(Username);
		driver.findElement(By.id("searchBtn")).click();
		
		WebElement restable = driver.findElement(By.id("resultTable"));
		
		List<WebElement> rows,cols;
		
		rows = driver.findElements(By.tagName("tr"));
		boolean res = false;
		for(int i=1;i<rows.size();i++) {
			cols=rows.get(i).findElements(By.tagName("td"));
			if(cols.get(1).getText().equals(Username))
			{
				res=true;
				break;
			}
 			
		}
		return res;
		
	}
	

}
