package pack;

public class Poitest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("E:\\tabledata.xlsx‪");
		XSSFWorkbook wb = new XSSFWorkbook(file);
	    XSSFSheet st = wb.getSheet("Sheet1");
	    int rows = st.getLastRowNum();
	    System.out.println(rows);
	   wb.close();
	    
	    
		
	}

}
