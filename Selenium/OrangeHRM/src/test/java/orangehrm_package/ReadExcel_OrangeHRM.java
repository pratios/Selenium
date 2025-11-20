package orangehrm_package;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.*;

public class ReadExcel_OrangeHRM {
	
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	
	public ReadExcel_OrangeHRM(String path, String sheetName) {
		
		try {
			File f = new File(path);
			FileInputStream fin = new FileInputStream(f);
			book = new XSSFWorkbook(fin);
			sheet = book.getSheet(sheetName);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error in ReadExcel_OrangeHRM class : "+e.getMessage());
		}
	}
	
	public int getLastRowNumberOR() {
		return sheet.getLastRowNum();
	}
	
	public int getLastColumnNumberOR(int r) {
		return sheet.getRow(r).getLastCellNum();
	}
	
	public String getCellValueOR(int r, int c) {
		Cell cell = sheet.getRow(r).getCell(c);
		
		switch (cell.getCellType()) {
		case STRING:
			return cell.getStringCellValue();
		case NUMERIC:
			return String.valueOf((long)cell.getNumericCellValue());
		default:
			return "";
		}
	}
}
