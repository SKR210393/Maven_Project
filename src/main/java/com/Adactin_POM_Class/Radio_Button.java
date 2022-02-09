package com.Adactin_POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Radio_Button {

	private WebDriver driver;

	public Radio_Button(WebDriver driver2) {

		this.driver = driver2;
	}

	@FindBy(name = "radiobutton_0")
	private WebElement select;

	public WebElement getSelect() {
		return select;
	}
	@FindBy(name="continue")
	private WebElement clickContinue;

	public WebElement getClickContinue() {
		return clickContinue;
	}

}
