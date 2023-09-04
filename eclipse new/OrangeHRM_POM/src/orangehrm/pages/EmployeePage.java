package orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeePage 
{

	@FindBy(linkText="PIM")
	WebElement pim_link;
	
	@FindBy(linkText="Add Employee")
	WebElement addemployee_link;
	
	@FindBy(id="firstName")
	WebElement fname_element;
	
	@FindBy(id="lastName")
	WebElement lname_element;
	
	@FindBy(id="btnSave")
	WebElement save_element;
	
	@FindBy(id="employeeId")
	WebElement empno_element;
	
	@FindBy(id="personal_txtEmployeeId")
	WebElement empno_pdetails_element;
	
	public boolean addEmployee(String fname,String lname)
	{
		pim_link.click();
		addemployee_link.click();
		
		fname_element.sendKeys(fname);
		lname_element.sendKeys(lname);
		String expempno = empno_element.getAttribute("value");
		save_element.click();
		
		String actempno = empno_pdetails_element.getAttribute("value");
		if(expempno.equals(actempno))
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	
	
}
