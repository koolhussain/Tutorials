package com.abc.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAppPartial {

	public static void main(String[] args) throws Exception {
		String url = "http://www.facebook.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.partialLinkText("Forgotten")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
