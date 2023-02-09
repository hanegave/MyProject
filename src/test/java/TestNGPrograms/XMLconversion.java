package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XMLconversion extends BaseClassForXMLconversion{
	@Test
	public void GoogleTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if(driver.getTitle().contains("Google")){
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		driver.quit();	
			
	}
	@Test
	public void Facebook() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if(driver.getTitle().contains("facebook")){
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		driver.quit();	
	}
}
