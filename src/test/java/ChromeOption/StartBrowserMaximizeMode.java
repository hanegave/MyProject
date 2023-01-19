package ChromeOption;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StartBrowserMaximizeMode {

	public static void main(String[] args) {
	
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--disable-notifications");
			
			WebDriver driver = new ChromeDriver(options);
			//driver.manage().window().maximize();
			driver.get("https://www.yatra.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

}
