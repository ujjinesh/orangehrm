package orangehrm.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import orangehrm.library.Employee;
import orangehrm.library.LoginPage;
import orangehrm.library.User;
import utils.AppUtils;
import utils.XLUtils;

public class OrangeHRMTestSuite extends AppUtils 
{

	String keywordfile = "C:\\Selenium_8AM\\OrangeHRM_Hybrid\\keywordfiles\\OrangeHRMKeywords.xlsx";
	String tcsheet = "TestCases";
	String tssheet = "TestSteps";
	
	@Test
	public void checkOrangeHRM() throws IOException, InterruptedException
	{
	
		int tccount = XLUtils.getRowCount(keywordfile, tcsheet);	
		int tscount = XLUtils.getRowCount(keywordfile, tssheet);
	
		String tcexeflag,tcid,tstcid,keyword;
		String stepres,tcres;
		
		String adminuid,adminpwd;
		String fname,lname;
		String role,empname,uname,pword;
		String empuid,emppwd;
		
		LoginPage lp = new LoginPage();
		Employee emp = new Employee();
		User us = new User();
		
		boolean res = false;
		for(int i=1;i<=tccount;i++)
		{
			tcexeflag = XLUtils.getStringCellData(keywordfile, tcsheet, i, 2);
			if(tcexeflag.equalsIgnoreCase("y"))
			{
				tcid = XLUtils.getStringCellData(keywordfile, tcsheet, i, 0);
				for(int j=1;j<=tscount;j++)
				{
					tstcid = XLUtils.getStringCellData(keywordfile, tssheet, j, 0);
					if(tstcid.equalsIgnoreCase(tcid))
					{
						keyword = XLUtils.getStringCellData(keywordfile, tssheet, j, 4);
						switch (keyword.toLowerCase()) 
						{
						case "adminlogin":
							adminuid = XLUtils.getStringCellData(keywordfile, tssheet, j, 5);
							adminpwd = XLUtils.getStringCellData(keywordfile, tssheet, j, 6);
							lp.Login(adminuid, adminpwd);
							res = lp.isAdminModuleDisplayed();							
							break;
						case "logout":		
							res = lp.logout();
							break;
						case "newempreg":
							fname = XLUtils.getStringCellData(keywordfile, tssheet, j, 5);
							lname = XLUtils.getStringCellData(keywordfile, tssheet, j, 6);
							res = emp.addEmployee(fname, lname);
							break;
						case "newuserreg":
							role = XLUtils.getStringCellData(keywordfile, tssheet, j, 5);
							empname = XLUtils.getStringCellData(keywordfile, tssheet, j, 6);
							uname = XLUtils.getStringCellData(keywordfile, tssheet, j, 7);
							pword = XLUtils.getStringCellData(keywordfile, tssheet, j, 8);
							res = us.addUser(role, empname, uname, pword);
							break;
						case "emplogin":
							empuid = XLUtils.getStringCellData(keywordfile, tssheet, j, 5);
							emppwd = XLUtils.getStringCellData(keywordfile, tssheet, j, 6);
							lp.Login(empuid, emppwd);
							res = lp.isEmpModuleDisplayed();
							break;
						case "invalidlogin":
							uname = XLUtils.getStringCellData(keywordfile, tssheet, j, 5);
							pword = XLUtils.getStringCellData(keywordfile, tssheet, j, 6);
							lp.Login(uname, pword);
							res = lp.isErrMsgDisplayed();
							break;
						}
						
						// Code to update Step Result
						if(res)
						{
							stepres = "Pass";
							XLUtils.setCellData(keywordfile, tssheet, j, 3, stepres);
							XLUtils.fillGreenColor(keywordfile, tssheet, j, 3);
						}else
						{
							stepres = "Fail";
							XLUtils.setCellData(keywordfile, tssheet, j, 3, stepres);
							XLUtils.fillRedColor(keywordfile, tssheet, j, 3);
						}
						
						// code to update TestCase Result
						
						tcres = XLUtils.getStringCellData(keywordfile, tcsheet, i, 3);
						if(!tcres.equalsIgnoreCase("fail"))
						{
							XLUtils.setCellData(keywordfile, tcsheet, i, 3, stepres);
						}
						
						// Code to fill TestCase Result Colors
						tcres = XLUtils.getStringCellData(keywordfile, tcsheet, i, 3);
						if(tcres.equalsIgnoreCase("Pass"))
						{
							XLUtils.fillGreenColor(keywordfile, tcsheet, i, 3);
						}else
						{
							XLUtils.fillRedColor(keywordfile, tcsheet, i, 3);
						}
						
					}
					
				}
				
				
			}else
			{
				XLUtils.setCellData(keywordfile, tcsheet, i, 3, "Blocked");
				XLUtils.fillRedColor(keywordfile, tcsheet, i, 3);
			}
		}
		
	}
	
	
	
}
