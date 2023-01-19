package VtigerCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import genericUtilities.IConstantPath;
import genericUtilities.PropertiesFileUtility;
import genericUtilities.WebDriverUtility;

public class LoginCRM {

	public static void main(String[] args) {
		PropertiesFileUtility property= new PropertiesFileUtility();
		WebDriverUtility wb= new WebDriverUtility();
		property.propertyFileInitialization(IConstantPath.PROPERTY_FILE_PATH);
		String url=property.FetchProperty("url");
		String browser=property.FetchProperty("browser");
		long time=Long.parseLong(property.FetchProperty("timeout"));
		WebDriver driver= wb.openApplication(browser, url, time);
		String username=property.FetchProperty("username");
		String passward=property.FetchProperty("passward");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(passward);
		driver.findElement(By.id("submitButton")).click();
		
		
	}

}
