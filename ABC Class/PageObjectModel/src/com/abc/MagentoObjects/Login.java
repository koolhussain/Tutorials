package com.abc.MagentoObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	By email = By.id("email");
	By pwd = By.id("pass");
	By login = By.id("send2");
	
	WebDriver driver;

	public Login(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void typeEmail(String data) {
		driver.findElement(email).sendKeys(data);
	}
	
	public void typePassword(String data) {
		driver.findElement(pwd).sendKeys(data);
	}
	
	public void clickOnLogin() {
		driver.findElement(login).click();
	}

}
