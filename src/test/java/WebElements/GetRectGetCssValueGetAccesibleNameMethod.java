package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectGetCssValueGetAccesibleNameMethod {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element=driver.findElement(By.linkText("Create New Account"));
		System.out.println(element.getAccessibleName());
		System.out.println(element.getCssValue("color"));
		System.out.println("background-color");
		
		Rectangle r=element.getRect();
		System.out.println("Height:"+ r.getHeight());
		System.out.println("Wedth: "+r.getWidth());
		System.out.println("X coordinate: "+r.getX());
		System.out.println("y coordinate: "+r.getY());
		
		driver.quit();

	}

}
