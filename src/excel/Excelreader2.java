package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreader2 {

	public static void main(String[] args) throws IOException {
		
		
		File f = new File(System.getProperty("user.dir")+"\\KTCTC.xlsx");
		
		FileInputStream fis = new  FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Aug");
		
		int rowsNum = sh.getLastRowNum();
		System.out.println(rowsNum);
		
		int rowsnum1 = sh.getPhysicalNumberOfRows();
		
		System.out.println(rowsnum1);
		
		for (int i=0; i<=rowsNum;i++)
		{
			System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
		}
		
		System.out.println("=============================================");
		
		for (int i=0; i<rowsnum1;i++)
		{
			XSSFRow row = sh.getRow(i);		
			
			XSSFCell cel = row.getCell(0);
			
			String str = cel.getStringCellValue();
			System.out.println(str);
		}
		
		
		

	}

}
