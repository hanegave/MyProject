package ChromeOption;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalElementsInPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
		driver.manage().window().maximize();
		int count=1, sum=0;
		do {
			List<WebElement> list=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
			count++;
			sum=sum+list.size();
			if(count>18) {
				break;
			}
			
			driver.findElement(By.xpath(""))
		}while(true);
		
		
	}

}
