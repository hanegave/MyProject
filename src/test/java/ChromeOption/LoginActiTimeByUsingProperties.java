package ChromeOption;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActiTimeByUsingProperties {

	public static void main(String[] args) throws IOException {
		FileInputStream fs=new FileInputStream("./src/test/resources/src/Resources/Demo.ActiTime.properties");
		Properties p=new Properties();
		p.load(fs);
		String url=p.getProperty("url");
		String username=p.getProperty("UserName");
		String password=p.getProperty("PassWord");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
	}

}
