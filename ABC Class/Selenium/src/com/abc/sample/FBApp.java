package com.abc.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBApp {

	public static void main(String[] args) throws Exception {
		String url = "http://www.facebook.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys("sachin@gmail.com");
		Thread.sleep(3000);
		driver.close();
	}

}
