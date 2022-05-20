package com.reuse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reuse {
 public static WebDriver driver;
	public void launch(String url) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
		driver.get(url);
		
	}
	public void keys(WebElement ele,String data) {
		ele.sendKeys(data);
	}
	

}
