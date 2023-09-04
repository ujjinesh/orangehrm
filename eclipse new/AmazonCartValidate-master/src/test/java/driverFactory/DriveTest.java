package driverFactory;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import PageFactory.ACartPage;
import PageFactory.AfrontPage;
import PageFactory.AitemsPage;
import PageFactory.AselecteItemPage;
import config.AppUtil;

public class DriveTest extends AppUtil {

	//ExtentReports report;
	ExtentTest test;
	ExtentReports report=new ExtentReports("./Extentreport/Result.html");
	@Test(priority = 0,description = "verification of search text box and search button")
	public void search() throws Throwable {
		test=report.startTest("Amazon Entering key values in serch box");
		test.assignAuthor("Mukesh");
		AfrontPage Fpage=PageFactory.initElements(driver, AfrontPage.class);
		Fpage.searchBtn("sport shoes for men");
		test.log(LogStatus.PASS,"Test Success");
		report.endTest(test);
		report.flush();
	}
	@Test(priority = 1,description = "verification of collection of items in a API,No. of opened windows and also vrification of clicked item")
	public void items() throws Throwable {
		test=report.startTest("Amazon print all shown products on console,"+"\nAmazone verification of No. of opened windows,"+"\nAmazon verification of product title");
		test.assignAuthor("Mukesh");
		AitemsPage collectionOfShoes=PageFactory.initElements(driver, AitemsPage.class);
		collectionOfShoes.shoesPage();
		collectionOfShoes.verify_Windows();
		collectionOfShoes.verify_Products();
		test.log(LogStatus.PASS,"Test Success");
		report.endTest(test);
		report.flush();
	}
	@Test(priority = 2,description = "verification of increasing quantity of similar items in cart")
	public void singleItem() throws Throwable {
		test=report.startTest("Amazon Cart Price verification After product addition to cart");
		test.assignAuthor("Mukesh");
		AselecteItemPage singleProduct=PageFactory.initElements(driver,AselecteItemPage.class);
		//singleProduct.verify_price()
		singleProduct.verify_price();

		test.log(LogStatus.PASS,"Test Success");
		report.endTest(test);
		report.flush();
	}
	@Test(priority = 3,description = "verification of cart page API and also take a screenshot")
	public void cart() throws Throwable {
		test=report.startTest("Amazon Cart page verification and Take screenshot of cart page");
		test.assignAuthor("Mukesh");
		ACartPage chandan=PageFactory.initElements(driver, ACartPage.class);
		chandan.verify_Cart();
		test.log(LogStatus.PASS,"Test Success");
		report.endTest(test);
		report.flush();
	}

}
