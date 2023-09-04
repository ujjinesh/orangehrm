package orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{

	// define elements	
	@FindBy(id="txtUsername")
	WebElement uid_element;
	
	@FindBy(name="txtPassword")
	WebElement pwd_element;
	
	@FindBy(xpath="//*[@value='LOGIN']")
	WebElement login_element;
	
	@FindBy(linkText="Admin")
	WebElement admin_link;
	
	@FindBy(partialLinkText="Welcome")
	WebElement welcome_link;
	
	@FindBy(linkText="Logout")
	WebElement logout_link;
	
	// define functions
	
	public void login(String uid,String pwd)
	{
		uid_element.sendKeys(uid);
		pwd_element.sendKeys(pwd);
		login_element.click();		
	}
	
	public boolean isAdminModuleDisplayed()
	{
		if(admin_link.isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public void logout()
	{
		welcome_link.click();
		logout_link.click();
	}
	
}
