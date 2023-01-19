package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contains reusable methods related to action performed
 * 
 * @author Vaibhav
 */

public class PropertiesFileUtility {

	private Properties property;

	/**
	 * This method is used to initialize Properties file
	 * 
	 * @param path
	 */

	public void propertyFileInitialization(String path) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		property = new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to fetch the data for properties file
	 * 
	 * @param Key
	 * @returm
	 */
	public String FetchProperty(String Key) {
		return property.getProperty(Key);
	}

	public void modifyPropertiesFile(String Key, String value, String path, String message) {
		property.put(Key, value);
		FileOutputStream Fos = null;
		try {
			Fos = new FileOutputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			property.store(Fos, message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
