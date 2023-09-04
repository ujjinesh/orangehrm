package orangehrm.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.pages.LoginPage;
import utils.AppUtils;

public class AdminLoginTest extends AppUtils 
{

	@Parameters({"adminuid","adminpwd"})
	@Test
	public void checkAdminLogin(String uid,String pwd)
	{
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		lp.login(uid, pwd);
		boolean res = lp.isAdminModuleDisplayed();
		Assert.assertTrue(res);
		lp.logout();
		
	}
	
	
}
