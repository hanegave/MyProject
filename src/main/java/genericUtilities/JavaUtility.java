package genericUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/**
 * This class contains reusable methods of java
 * @author Vaibhav
 *
 */

public class JavaUtility {
	public int generateRandomNumber(int limit) {
		Random random = new Random();
		return random.nextInt(limit);
	}
	/**
	 * This method used to fetch current date and time
	 * @return
	 */
	public String getCurrentTime() {
		Date date=new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd_MM_yyyy_hh_mm_sss");
		return sdf.format(date);
		
	}

}
