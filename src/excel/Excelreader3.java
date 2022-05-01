package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreader3 {

	public static void main(String[] args) throws IOException {
		
		
		File f = new File(System.getProperty("user.dir")+"\\KTCTC.xlsx");
		
		FileInputStream fis = new  FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Aug");
		
		int rowsNum = sh.getLastRowNum();
		System.out.println(rowsNum);
		
		int rowsnum1 = sh.getPhysicalNumberOfRows();
		
		System.out.println(rowsnum1);
		
		
		
		for (int i=0; i<rowsnum1;i++)
		{
			XSSFRow row = sh.getRow(i);		
			
			XSSFCell cel = row.getCell(1);
			
			CellType ctype = cel.getCellType();
			
			switch (ctype) {
			case STRING:
				System.out.println(cel.getStringCellValue());
				break;
				
			case NUMERIC:
				System.out.println(cel.getNumericCellValue());
				break;
			case BOOLEAN:
				System.out.println(cel.getBooleanCellValue());
				break;
				
			case BLANK:
				System.out.println("cell does not have value");
				break;
			case FORMULA:
				System.out.println(cel.getCellFormula());
				break;

			default:
				System.out.println("unknown cell type");
				break;
			}
			
			
			
		}
		
		
		// read cell according to cell type (use if else logic)
	   // read actual number from excel cel without exponential value

	}

}
