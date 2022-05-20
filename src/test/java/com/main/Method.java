package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.reuse.Reuse;

public class Method extends Reuse {
	public static void main(String[] args) {
		Reuse r = new Reuse();
		r.launch("https://www.facebook.com/");
		WebElement findElement = driver.findElement(By.id("email"));
		r.keys(findElement, "Welcome");
		WebElement findElement2 = driver.findElement(By.id("pass"));
		r.keys(findElement2, "12354");
	}

}
