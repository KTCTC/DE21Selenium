package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreader5CreateArrayList {

	public static void main(String[] args) throws IOException {
		
		
		File f = new File(System.getProperty("user.dir")+"\\KTCTC.xlsx");
		
		FileInputStream fis = new  FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Aug");
		
		int rowsNum = sh.getLastRowNum();
		System.out.println(rowsNum);
		
		int rowsnum1 = sh.getPhysicalNumberOfRows();
		
		System.out.println(rowsnum1);
		
		
		ArrayList<String> keys = new ArrayList<>();
		
		ArrayList<String> values = new ArrayList<>();
		
		for (int i=1; i<rowsnum1;i++)
		{
			XSSFRow row = sh.getRow(i);		
		
		XSSFCell cel = row.getCell(0);
		
		String each = getValueFromCellAccordingToitsType(cel);
		
		keys.add(each);
			
		}
		
		for (int i=1; i<rowsnum1;i++)
		{
			XSSFRow row = sh.getRow(i);		
		
		XSSFCell cel = row.getCell(1);
		
		String each = getValueFromCellAccordingToitsType(cel);
		
		values.add(each);
			
		}
		
		System.out.println(keys);
		System.out.println(values);
		
		/*
		 * for (int i=1; i<rowsnum1;i++) { XSSFRow row = sh.getRow(i);
		 * 
		 * 
		 * for (int j=0;j<=row.getLastCellNum();j++) { XSSFCell cel = row.getCell(j);
		 * 
		 * String each = getValueFromCellAccordingToitsType(cel); if (j==0) {
		 * keys.add(each); } else { values.add(each); } }
		 */
			

	}
	
	public static String getValueFromCellAccordingToitsType(XSSFCell cel)
	{
CellType ctype = cel.getCellType();
		Object data = null;
		switch (ctype) {
		case STRING:
			data = cel.getStringCellValue();
			break;
			
		case NUMERIC:
			data = cel.getNumericCellValue();
			break;
		case BOOLEAN:
			data = cel.getBooleanCellValue();
			break;
			
		case BLANK:
			data = "Blank";
			System.out.println("cell does not have value");
			break;
		case FORMULA:
			data = cel.getCellFormula();
			break;

		default:
			data = "Blank";
			System.out.println("unknown cell type");
			break;
		}	
		
		return data.toString();
	}

}
