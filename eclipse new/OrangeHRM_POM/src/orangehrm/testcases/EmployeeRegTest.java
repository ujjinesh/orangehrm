package orangehrm.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.pages.EmployeePage;
import orangehrm.pages.LoginPage;
import utils.AppUtils;

public class EmployeeRegTest extends AppUtils 
{

	@Parameters({"fname","lname"})
	@Test
	public void checkEmpReg(String fname,String lname)
	{
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		lp.login("Admin", "Qedge123!@#");
		
		EmployeePage emp = PageFactory.initElements(driver, EmployeePage.class);
		boolean res = emp.addEmployee(fname, lname);
		Assert.assertTrue(res);
		lp.logout();
		
	}
	
	
	
	
}
