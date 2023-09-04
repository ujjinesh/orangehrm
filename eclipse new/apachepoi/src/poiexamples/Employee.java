package poiexamples;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employee {

	public static void main(String[] args) throws Exception {

		FileInputStream fi = new FileInputStream("C:\\exceltables\\testdata.xlsx");

		Workbook wb = new XSSFWorkbook(fi);
		Sheet ws = wb.getSheet("employee");
		int rowCount = ws.getLastRowNum();
		for(int i=1;i<rowCount;i++) {
		Row row = ws.getRow(i);
		
		Cell c1 = row.getCell(0);
		Cell c2 = row.getCell(1);
		Cell c3 = row.getCell(2);
		Cell c4 = row.getCell(3);
		Cell c5 = row.getCell(4);
		
		String empno = c1.getStringCellValue();
		String empname = c2.getStringCellValue();
		double salary = c3.getNumericCellValue();
		boolean Active = c4.getBooleanCellValue();
		String result = c5.getStringCellValue();
	
		System.out.println(empno+" "+empname+" "+salary+" "+Active);
		
		}
		wb.close();
		
		
		

	}

}
