package utils;

public class ExcelTest {
	static String projectdir = System.getProperty("user.dir");
	static String xlpath = projectdir + "./DataFiles/RestData.xlsx";
	static String sheetname = "DataSheet";
	public static void main(String[] args) 
	{
	 	ExcelUtilities utils = new ExcelUtilities(xlpath, sheetname );
	}

}
