package propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyWritter {

	public static void main(String[] args) throws IOException {
File f = new File(System.getProperty("user.dir")+"\\DE21Prop.properties");
		
		FileOutputStream fos = new FileOutputStream(f);	
		
		Properties proObj = new Properties();
		
		proObj.setProperty("userName", "PQRS");
		
		proObj.setProperty("mobileNumber", "4567890987");
		System.out.println("written file");
		
		proObj.store(fos, "updated username and added mobileNumber");
		
		// Write logic so that, data will not get loosed 
		

	}

}
