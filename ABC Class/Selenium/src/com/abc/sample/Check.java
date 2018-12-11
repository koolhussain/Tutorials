package com.abc.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {

	public static void main(String[] args) {
		String eurl = "http://www.gmail.com";
		WebDriver driver = new ChromeDriver();
		driver.get(eurl);
		String aurl = driver.getCurrentUrl();
		driver.close();
		if(eurl.equals(aurl)) {
			System.out.println("Login to Gmail Application");
		}else {
			System.out.println("Login failed for Gmail Application");
		}
	}

}
