package com.abc.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws Exception {
		String url = "http://www.magento.com";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(5000);
		driver.close();
	}
}
