package com.abc.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrlApp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		String currenturl = driver.getCurrentUrl();
		driver.close();
		System.out.println(currenturl);
	}
}
