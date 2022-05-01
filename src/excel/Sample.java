package excel;

import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) {

ExcelHelper exHelp = new ExcelHelper("KTCTC.xlsx", "Oct");
ArrayList<String> keys = exHelp.getKeysListFromExcel();
ArrayList<String> values = exHelp.getValuesListFromExcel();

System.out.println(keys);
System.out.println(values);
System.out.println(exHelp.getKeysValuePairFromExcel());


	}

}
