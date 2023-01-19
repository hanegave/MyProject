import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadataFromProperties {

	public static void main(String[] args) throws IOException {
		//step 1: convert phicial fle into java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/commonData.properties");
		//step 2: create an instance for properties class
		//properties class is available in JAVA.UTIL package
		Properties p=new Properties();
		
		//step 3: load all the key values pairs to properties object
		p.load(fis); //it Throws IOException
		//Java concept involved - Map interface - HashTable
		//step 4: Read data
		String url=p.getProperty("url");
		long time=Long.parseLong(p.getProperty("timeouts"));
		
		System.out.println(url+"\t"+time);
	}

}
