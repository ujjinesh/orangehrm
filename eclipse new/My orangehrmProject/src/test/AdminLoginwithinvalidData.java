package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utls.AppUtiles;
import body.loginpage;

public class AdminLoginwithinvalidData extends AppUtiles {

	@Parameters({"uidi","pwdi"})
	@Test
	public void invalidData(String uid,String pwd) {
		loginpage lp= new loginpage();
		
		lp.invalidData(uid,pwd);
		lp.isErrMsgDisplayed();
	}
}
