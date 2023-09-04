package poiexamples;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlutils {

	public static void main(String[] args) throws Exception {

		FileInputStream fi = new FileInputStream("C:\\exceltables\\testdata.xlsx");
		
		Workbook wb = new XSSFWorkbook(fi);
		Sheet ws = wb.getSheet("EmpData");
		
		Row row = ws.getRow(0);
		
		Cell c1 = row.getCell(0);
		Cell c2 = row.getCell(1);
		
		String empno = c1.getStringCellValue();
		String empnum = c2.getStringCellValue();
		
		System.out.println(empno);
		System.out.println(empnum);
		

	}

}

