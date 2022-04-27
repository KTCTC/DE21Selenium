package propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static void main(String[] args) throws Exception {
	
		File f = new File("C:\\Users\\91992\\DE21\\DE21Selenium\\DE21Prop.properties");
		
		File ff = new File(System.getProperty("user.dir")+"\\DE21Prop.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		Properties proObj = new Properties();
		
		proObj.load(fis);
		
		String url = proObj.getProperty("baseURL");
		
		System.out.println(url);
		
		System.out.println(proObj.getProperty("userName"));
		
		

	}

}
