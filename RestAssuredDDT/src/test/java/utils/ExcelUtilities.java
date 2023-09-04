package utils;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	//static HSSFWorkbook hworkbook;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static FileInputStream fi ;

	public ExcelUtilities(String excelpath, String sheetname) {
		try {
			
			 fi = new FileInputStream(excelpath);
			workbook = new XSSFWorkbook(fi);
			//hworkbook = new HSSFWorkbook(new POIFSFileSystem(fi));
			sheet = workbook.getSheet(sheetname);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

//	public static void main(String[] args) {
//		getRowCount();
//		getCellData();
//	}

	public static void getRowCount() {
		try

		{
			int rows = sheet.getPhysicalNumberOfRows();
			System.out.println("Total Rows :" + rows);

		} 
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}

	public static void getCellData(int rownum , int colnum) {
		try {
			 String projectdir = System.getProperty("user.dir");
			 String xlpath = projectdir+"./DataFiles/RestData.xlsx";
			 workbook = new XSSFWorkbook(xlpath);
			 sheet = workbook.getSheet("DataSheet");
			 String cellvalue =
			 sheet.getRow(1).getCell(0).getStringCellValue();
			 System.out.println(cellvalue);

			//int subjectid = (int) sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
			DataFormatter dfm = new DataFormatter();
			Object object = dfm.formatCellValue(sheet.getRow(1).getCell(2));

			System.out.println();
			System.out.println(object);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}
	}

}
