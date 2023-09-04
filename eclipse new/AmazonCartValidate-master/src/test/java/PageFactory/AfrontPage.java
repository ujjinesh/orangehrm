package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfrontPage {
	
	public WebDriver driver;
	public AfrontPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement EnterKeysInSearchBox;
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement ClickSearchBtn;
	
	public String searchBtn(String EnterKeys) 
	{
		this.EnterKeysInSearchBox.sendKeys(EnterKeys);
		this.ClickSearchBtn.click();
		return EnterKeys;		
	}

}
