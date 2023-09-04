package body;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utls.AppUtiles;

public class Employee extends AppUtiles{

	public boolean addEmployee(String fname,String lname) {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		String mech =driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
        
		driver.findElement(By.id("empsearch_id")).sendKeys(mech);
		driver.findElement(By.id("searchBtn")).click();
		
		List<WebElement> rows,cols;
		WebElement empdata=driver.findElement(By.id("resultTable"));
		rows=empdata.findElements(By.tagName("tr"));
		boolean res = false; 
		for(int i=1;i<rows.size();i++)
		{
			cols=rows.get(i).findElements(By.tagName("td"));
			if(cols.get(i).getText().equals(empdata))
			{
				res=true;
				break;
			}
		}
		
		return res;

	}
	
}

