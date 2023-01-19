package WebElements;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenShot {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement loginButton=driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		
		File src = loginButton.getScreenshotAs(OutputType.FILE);
		File dest= new File("./ElementScreenshot/"+loginButton.getText()+"vai.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}	
		driver.quit();
		
	}

}
