package test;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utls.AppUtiles;
import body.loginpage;

public class AdminloginwithvalidData extends AppUtiles{
	
	@Parameters({"adminuid","adminpwd"})
	@Test
	public void checkLogin(String uid,String pwd) {
		loginpage lp= new loginpage();
		lp.login(uid,pwd);
	    lp.logOut();				
	}

}
