package functions.RestAssured.tests;

import io.restassured.RestAssured;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
public class BasicAPITests 
{
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static FileInputStream fi ;
	static String token   = "1ebc8c5acbb1e6696661e4504da11b50d531ad94174af5fd409eab7091d5b13d";
	Properties prop = new Properties();

	public void  postRequest() 
	{	try
			{
//		fi = new FileInputStream("C:/Users/SPURGE/workspace/RestAssuredDDT/DataFiles/Exceltemp.xlsx");
//		workbook = new XSSFWorkbook(fi);
//		sheet = workbook.getSheet("DataSheet");

		DataFormatter dfm = new DataFormatter();
		Object id = dfm.formatCellValue(sheet.getRow(1).getCell(0));
		//int id = (int)sheet.getRow(1).getCell(0).getNumericCellValue();
		String name = sheet.getRow(1).getCell(1).getStringCellValue();
		String email = sheet.getRow(1).getCell(2).getStringCellValue();
		String gender = sheet.getRow(1).getCell(3).getStringCellValue();
		String status = sheet.getRow(1).getCell(4).getStringCellValue();

		FileInputStream f2= new FileInputStream("C:/Users/SPURGE/workspace/RestAssuredDDT/Properties/config.properties");
		prop.load(f2);
		
		RestAssured.baseURI = prop.getProperty("BaseURI");
		String basepath = prop.getProperty("PostResource");

		JSONObject bodyparam =  new JSONObject();
		bodyparam.put("id", id);
		bodyparam.put("name", name);
		bodyparam.put("email", email);
		bodyparam.put("gender", gender);
		bodyparam.put("status", status);

		RestAssured.given()
		.log().all().header("Authorization","Bearer "+token)
		.contentType("application/json")
		.body(bodyparam.toString())
		.when().post(basepath)
		.then().log().all();

		workbook.close();
		fi.close();

	}
	catch(Exception e )
	{
		e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
	}

	}

	public static void main(String[] args) {


		BasicAPITests bat = new BasicAPITests();
		bat.postRequest();
	}
}
