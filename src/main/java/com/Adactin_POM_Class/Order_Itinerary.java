package com.Adactin_POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Itinerary {

	private WebDriver driver;

	public Order_Itinerary(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='my_itinerary']")
	private WebElement orderHistory;

	public WebElement getOrderHistory() {
		return orderHistory;
	}
}
