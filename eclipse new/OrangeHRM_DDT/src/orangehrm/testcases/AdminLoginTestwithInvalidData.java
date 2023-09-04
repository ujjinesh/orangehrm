package orangehrm.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import orangehrm.library.LoginPage;
import utils.AppUtils;
import utils.XLUtils;

public class AdminLoginTestwithInvalidData extends AppUtils 
{

	String datafile = "C:\\Selenium_8AM\\OrangeHRM_DDT\\testdatafiles\\TestData.xlsx";
	String datasheet = "AdminLogin_InvalidData";
	
	@Test
	public void checkAdminLogin() throws IOException
	{
	
		int rowcount = XLUtils.getRowCount(datafile, datasheet);
		
		LoginPage lp = new LoginPage();
		String uid,pwd;
		
		for(int i=1;i<=rowcount;i++)
		{
			uid = XLUtils.getStringCellData(datafile, datasheet, i, 0);
			pwd = XLUtils.getStringCellData(datafile, datasheet, i, 1);
			lp.Login(uid, pwd);
			boolean res = lp.isErrMsgDisplayed();
			Assert.assertTrue(res);
			if(res)
			{
				XLUtils.setCellData(datafile, datasheet, i, 2, "Pass");
				XLUtils.fillGreenColor(datafile, datasheet, i, 2);
			}else
			{
				XLUtils.setCellData(datafile, datasheet, i, 2, "Fail");
				XLUtils.fillRedColor(datafile, datasheet, i, 2);
			}
		}
	}
	
	
	
}
