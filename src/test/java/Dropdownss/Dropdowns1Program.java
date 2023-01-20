package Dropdownss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns1Program {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(dropdown);
		
		if(s.isMultiple())
			System.out.println("Multiselect");
		else
			System.out.println("Single select");
		s.selectByIndex(3); // for Baby
		Thread.sleep(3000);
		s.selectByValue("search-alias=beauty-intl-ship");  // for beauty and personal care
		Thread.sleep(3000);
		s.selectByVisibleText("Books"); // for books
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
