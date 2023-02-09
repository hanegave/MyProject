package ToHandelNotifications;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class MicNotification {

	
		public static void main(String[] args) {
			HashMap<String, Integer> contentSettings = new HashMap<>();
			//contentSettings.put("geolocation", 2);
			contentSettings.put("notifications", 2);
			
			HashMap <String, Object> profile = new HashMap<>();
			profile.put("managed_default_content_setting", contentSettings);
			
			HashMap <String, Object> prefs = new HashMap<>();
			prefs.put("profile", profile);
			
			EdgeOptions options = new EdgeOptions();
			options.setExperimentalOption("prefs", prefs);
			
			
			WebDriver driver = new EdgeDriver(options);
			driver.manage().window().maximize();
			driver.get("http://www.spicejet.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
