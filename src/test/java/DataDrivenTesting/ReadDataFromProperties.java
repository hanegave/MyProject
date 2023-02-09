package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {

	public static void main(String[] args) throws IOException {
		//Step 1: Convert physical file into java readable file
		//new FileInputStream throws FileNotFoundException
		FileInputStream fis = new FileInputStream("./TestResources/CommonData.properties");
		//Step 2 : Create an instance for properties object
		//properties object should be imported from java.util package
		Properties property = new Properties();
		
		//step 3: Load all the key-value pairs into properties object
		//the below statement throws IoException
		property.load(fis);
		
		//Step4: Fetch the data using the key
		
		String url=property.getProperty("url");
		String browser=property.getProperty("browser");
		String user=property.getProperty("user");
		String passward=property.getProperty("passward");
		
		System.out.println(url+"\n"+browser+"\n"+passward+"\n"+user);		

	}

}
