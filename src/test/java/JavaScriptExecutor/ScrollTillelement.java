package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element =driver.findElement(By.xpath("//h2[.='Gaming merchandise']"));
		
		Point location = element.getLocation();
		int x=location.getX();
		int y=location.getY();
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		Thread.sleep(2000);
		driver.quit();

	}

}
