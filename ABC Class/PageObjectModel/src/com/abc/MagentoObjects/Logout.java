package com.abc.MagentoObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	By logout = By.linkText("Log Out");
	WebDriver driver;
	public Logout(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void clickOnLogout() {
		driver.findElement(logout).click();
		
	}
}
