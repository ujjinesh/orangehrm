package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class AselecteItemPage {
	
	WebDriver driver;
	public AselecteItemPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	@FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
	WebElement price;
	@FindBy(xpath = "//select[@id='quantity']")
	WebElement selectQuantity;
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement clickAddCart;
	@FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
	WebElement wholePrice;
	public boolean verify_price() {
		String SingleProdctprice=this.price.getText();
		Select quantity =new Select(this.selectQuantity);
		//Verify list box is single or multi selection 
		boolean value1=quantity.isMultiple();
		Reporter.log("Verified:: List box is MultiSelection type::"+value1,true);
		
		quantity.selectByVisibleText("3");
		clickAddCart.click();
		
		String wholeprice=wholePrice.getText();
		if (SingleProdctprice.equals(wholeprice)) {
			Reporter.log("Price = 3 X "+SingleProdctprice+"= "+wholeprice,true);
			return false;
			
		} else {
			Reporter.log("verified::Total Price After 3 similar product Add in Cart = 3 X "+SingleProdctprice+"= "+wholeprice,true);
			return true;

		}
	}

}
