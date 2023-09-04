package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utls.AppUtiles;
import body.loginpage;

public class EmployeeLoginTest extends loginpage {

	@Parameters({"empuid","emppwd"})
	@Test
	public void EmployeeLogin(String uid,String pwd) {
		
		EmployeeLoginTest obj = new EmployeeLoginTest();
		obj.login(uid,pwd);
	
		obj.logOut();
	}
}
