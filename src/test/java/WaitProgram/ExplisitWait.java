package WaitProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplisitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5000));
		// to wait until title appears
		boolean status=wait.until(ExpectedConditions.titleContains("actiTIME"));
		if(status)
			System.out.println("pass");
		else
			System.out.println("fail");
		
		WebElement username_TF=driver.findElement(By.id("username"));
		//to wait till username text field appwars
		wait.until(ExpectedConditions.visibilityOf(username_TF)).sendKeys("admin");
	
		WebElement passward_TF=driver.findElement(By.name("pwd"));
		//to wait till the passwaord text field appears
		wait.until(ExpectedConditions.visibilityOf(passward_TF)).sendKeys("manager");
		
		WebElement logButton=driver.findElement(By.id("loginButton"));
		logButton.click();
		//wait until login button
	}

}
