
public class fileUpload {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		driver.findElement(By.className("mqfihd-upload")).click();  //uploadBtnCont
//E:\\Selenium\\sample.pdf
		Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id='heroSection-container']/div[4]/div/div/section/div/form/div[1]/div[1]/div")).sendKeys("E:\\Selenium\\sample.pdf"); //E:\\Selenium\\sample.pdf
		//res.sendKeys("C:\\Users\\Hello\\Desktop\\ganga.txt");
	}

}
