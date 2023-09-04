package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import body.AdminModuleUtils;
import body.Users;

public class userRegtest extends AdminModuleUtils{

	@Parameters({"role","empname","uname","pwd"})
	@Test
	public void checkUserReg(String role,String empname,String uname,String pwd) throws InterruptedException {
		Users us = new Users();
		us.adduser(role,empname,uname,pwd);
	}
}
