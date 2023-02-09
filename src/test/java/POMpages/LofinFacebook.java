package POMpages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LofinFacebook {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		POMpageForFacebook loginPage = new POMpageForFacebook(driver);
		loginPage.setUsername("vaibhav");
		loginPage.setPassward("8745623");
		loginPage.clickLoginButton();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.quit();
	}

}
