package body;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utls.AppUtiles;

public class AdminModuleUtils extends AppUtiles{

	String adminuid="Admin";
	String adminpwd="Qedge123!@#";
	loginpage lp; 
	
	@BeforeTest
	public void adminLogin() {
		lp=new loginpage();
		lp.login(adminuid, adminpwd);
	}
	
	@AfterTest
    public void adminLogout() {
		lp.logOut();
		
	}
}
