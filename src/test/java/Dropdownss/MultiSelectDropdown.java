package Dropdownss;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		
		Select s=new Select(dropdown);
		if(s.isMultiple()) {
			s.selectByIndex(0);
			Thread.sleep(2000);
			
			s.selectByValue("99");
			Thread.sleep(2000);
			
			s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
			List<WebElement> selectOptions=s.getAllSelectedOptions();
			for(WebElement element : selectOptions) {
				System.out.println(element.getText());
			}
		}
		else
			System.out.println("single select");
		driver.quit();
	}

}
