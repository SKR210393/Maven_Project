package com.pom.cls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_Page {

	private WebDriver driver;
	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin;

	public WebElement getSignin() {
		return signin;
	}

	public SignIn_Page(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "email")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	@FindBy(name = "passwd")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}

	@FindBy(id = "SubmitLogin")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

}
