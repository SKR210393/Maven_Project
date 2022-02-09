package com.Adactin_POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

private WebDriver driver;

	@FindBy(name = "username") 
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	public Login_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(name = "login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

}
