package test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import body.AdminModuleUtils;
import body.Employee;

public class checkEmpRegtest extends AdminModuleUtils {

	@Parameters({"fname","lname"})
	@Test
	public void checkEmpReg(String fname,String lname) {
		
		Employee emp = new Employee();
		
		emp.addEmployee(fname, lname);
		
	}
}
