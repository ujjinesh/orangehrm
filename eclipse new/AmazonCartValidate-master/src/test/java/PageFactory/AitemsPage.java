package PageFactory;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AitemsPage {
	
	WebDriver driver;
	public AitemsPage(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	@FindBy(xpath = "(//span[@class='a-size-base-plus a-color-base'])")
	List<WebElement> productTitles;
	@FindBy(xpath = "//span[@class='a-price-whole']")
	List<WebElement> productPrices;
	@FindBy(xpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])[6]")
	WebElement clickOnAproduct;
	@FindBy(xpath = "//span[@id='productTitle']")
	WebElement productName;
	public void shoesPage() {
		System.out.println(this.productTitles.size());
		for(int i=0;i<this.productTitles.size();i++){
			Reporter.log(this.productTitles.get(i).getText()+"  \t             \n\tRs"+this.productPrices.get(i).getText(),true);
		}
		//String Expected=this.clickOnAproduct.getText();
		this.clickOnAproduct.click();
	}
	public void verify_Windows() {
		ArrayList<String> brow=new ArrayList<String>(driver.getWindowHandles());
		Reporter.log("No. of current open window::  "+brow.size(),true);

		//switch to child window
		//String parent=brow.get(0);
		String child1=brow.get(1);
		driver.switchTo().window(child1);
	}

	public boolean verify_Products() {
		ArrayList<String> brow=new ArrayList<String>(driver.getWindowHandles());
	
		String parent=brow.get(0);
		String child1=brow.get(1);
		driver.switchTo().window(parent);
		String Expected =clickOnAproduct.getText();
		
		driver.switchTo().window(child1);
		
		String Actual=this.productName.getText();
		
		if (Actual.toLowerCase().contains(Expected.toLowerCase())) {
			Reporter.log("Product verified:: "+Expected+"\n"+Actual,true);
			return true;

		} else {
			Reporter.log("Product Not verified:: "+Expected+"  "+Actual,true);
			return false;


		}

	}

}
