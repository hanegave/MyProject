package DataDrivenPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataIntoProperties {
	
	public static void main (String [] args) throws IOException {
		
		//step 1: Convert physical file into java readable object
		FileInputStream fis= new FileInputStream("./TestResources/CommonData.properties");
		
		// step2: create an instance of properties clss
		Properties property = new Properties();
		
		// step3: Load all Key-Value pares into properties object
		property.load(fis);
		
		//step4: write data into the properties file
		property.put("OS", "Windows");
		
		//step 5: save the changes in properties file
		FileOutputStream fos = new FileOutputStream("./TestResources/CommonData.properties");
		property.store(fos, "Uploaded sucessfully");
	}

}
