package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreader {

	public static void main(String[] args) throws IOException {
		
		
		File f = new File(System.getProperty("user.dir")+"\\KTCTC.xlsx");
		
		FileInputStream fis = new  FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Aug");
		
		XSSFRow row = sh.getRow(2);		
		
		XSSFCell cel = row.getCell(0);
		
		String str = cel.getStringCellValue();
		System.out.println(str);
		
		System.out.println(sh.getRow(2).getCell(1).getStringCellValue());
		
		

	}

}
