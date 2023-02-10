package DependenciesBetweenMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethod {
	WebDriver driver;
	@Test
	public void NavigateToActitime() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test (dependsOnMethods = "NavigateToActitime")
	public void loginToActitime() {
	driver.findElement(By.id("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
	WebElement userProfile = driver.findElement(By.className("userProfileLink"));
	if(userProfile.isDisplayed())
		System.out.println("Pass");
	else
		System.out.println("Fail");
	driver.quit();
	}

}
