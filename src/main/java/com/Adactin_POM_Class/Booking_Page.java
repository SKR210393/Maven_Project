package com.Adactin_POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Page {

	private WebDriver driver;

	public Booking_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "first_name")
	private WebElement firstName;

	@FindBy(name = "last_name")
	private WebElement lastName;

	@FindBy(name = "address")
	private WebElement address;

	@FindBy(name = "cc_num")
	private WebElement cardNumber;

	@FindBy(name = "cc_type")
	private WebElement ccType;

	@FindBy(name = "cc_exp_month")
	private WebElement expMonth;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	@FindBy(name = "cc_exp_year")
	private WebElement expYear;

	@FindBy(name = "cc_cvv")
	private WebElement cvv;

	@FindBy(name = "book_now")
	private WebElement bookNow;

}
