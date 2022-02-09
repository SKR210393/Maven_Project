package com.POM_Manager;

import org.openqa.selenium.WebDriver;

import com.Adactin_POM_Class.Booking_Page;
import com.Adactin_POM_Class.Hotel_SearchPage;
import com.Adactin_POM_Class.Login_Page;
import com.Adactin_POM_Class.Order_Itinerary;
import com.Adactin_POM_Class.Radio_Button;

public class Page_Object_Manager {

	public WebDriver driver;
	private Login_Page login;
	private Hotel_SearchPage search;
	private Radio_Button button;
	private Booking_Page booking;
	private Order_Itinerary orderHistory;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Login_Page getInstanceLogin() {

		if (login == null) {
			login = new Login_Page(driver);
		}
		return login;
	}

	public Hotel_SearchPage getInstanceSearch() {
		if (search == null) {
			search = new Hotel_SearchPage(driver);
		}
		return search;
	}

	public Radio_Button getInstanceButton() {

		if (button == null) {
			button = new Radio_Button(driver);

		}
		return button;
	}

	public Booking_Page getInstancebooking() {
		if (booking == null) {
			booking = new Booking_Page(driver);
		}
		return booking;
	}

	public Order_Itinerary getInstanceOrderHistory() {

		if (orderHistory == null) {
			orderHistory = new Order_Itinerary(driver);
		}
		return orderHistory;
	}
}
