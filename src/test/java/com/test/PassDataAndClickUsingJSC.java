package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassDataAndClickUsingJSC {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]", "https://www.amazon.com/");
		WebElement searchText=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		js.executeScript("arguments[0].value=arguments[1]",searchText,"Headfones");
		
		WebElement searchButton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		js.executeScript("arguments[0].click()", searchButton);
		Thread.sleep(5000);
		

	}

}
