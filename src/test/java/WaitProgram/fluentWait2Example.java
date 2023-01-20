package WaitProgram;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class fluentWait2Example {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//h4[contains(text(),'Example 1')]")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		WebElement header=wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				WebElement text = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
				if(text.isDisplayed())
					return text;
				else
					return null;
				
			}
		});
		System.out.println(header.getText()); 
		driver.quit();
		
		
	}

}
