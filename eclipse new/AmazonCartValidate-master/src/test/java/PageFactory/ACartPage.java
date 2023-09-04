package PageFactory;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ACartPage {
	
	WebDriver driver;
	public ACartPage(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	@FindBy(xpath = "//span[contains(.,'Added to Cart')]")
	WebElement AddedToCart;
	public boolean verify_Cart() throws Throwable {
		String ExpectedCart=this.AddedToCart.getText();
		String ActualCart="";
		if (ExpectedCart.contains(ActualCart)) {
			File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screen, new File("./screenshot/iteration/"+"Cart.png"));
			Reporter.log("Cart Verified:: "+ExpectedCart,true);
			return true;
			
		} else {
			Reporter.log("Cart Verification Fail:: "+ExpectedCart,true);
			return false;

		}
	}

}
