package com.abc.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBAppName {

	public static void main(String[] args) {
		String url = "http://www.facebook.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.name("email")).sendKeys("sachin@gmail.com");
		driver.close();

	}

}
