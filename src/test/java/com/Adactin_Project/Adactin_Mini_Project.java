package com.Adactin_Project;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import com.Maven_Project.Base_Class;
import com.POM_Manager.Page_Object_Manager;

public class Adactin_Mini_Project extends Base_Class {

	public static WebDriver driver = Base_Class.browserLaunch("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Throwable {

		getURL("https://adactinhotelapp.com/index.php");

		// Sign-in Page

		sendValues(pom.getInstanceLogin().getUsername(), "Saravanakumar");
		sendValues(pom.getInstanceLogin().getPassword(), "New123");
		clickMethod(pom.getInstanceLogin().getLogin());

		// Search Page

		dropDown(pom.getInstanceSearch().getLocation(), "byIndex", "3");
		dropDown(pom.getInstanceSearch().getHotels(), "byIndex", "2");
		dropDown(pom.getInstanceSearch().getRoomType(), "byValue", "Double");
		dropDown(pom.getInstanceSearch().getRoomNos(), "byVisibletext", "2 - Two");
		sendValues(pom.getInstanceSearch().getFromDate(), "09-02-2022");
		sendValues(pom.getInstanceSearch().getToDate(), "10-02-2022");
		dropDown(pom.getInstanceSearch().getAdultRoom(), "byIndex", "2");
		dropDown(pom.getInstanceSearch().getChildRoom(), "byValue", "2");
		clickMethod(pom.getInstanceSearch().getSearch());

		// Radiobutton_Page

		clickMethod(pom.getInstanceButton().getSelect());
		clickMethod(pom.getInstanceButton().getClickContinue());

		// Booking_Page

		sendValues(pom.getInstancebooking().getFirstName(), "Saravana");
		sendValues(pom.getInstancebooking().getLastName(), "Kumar");
		sendValues(pom.getInstancebooking().getAddress(), "PO 123, New Street, Brisbane- 12345");
		sendValues(pom.getInstancebooking().getCardNumber(), "1234123412341234");
		dropDown(pom.getInstancebooking().getCcType(), "byIndex", "3");
		dropDown(pom.getInstancebooking().getExpMonth(), "byIndex", "3");
		dropDown(pom.getInstancebooking().getExpYear(), "byIndex", "4");
		sendValues(pom.getInstancebooking().getCvv(), "777");
		clickMethod(pom.getInstancebooking().getBookNow());
		implicitWait(10, TimeUnit.SECONDS);

		// Order History Page

		clickMethod(pom.getInstanceOrderHistory().getOrderHistory());

		sleep(3000);
		takeSnap();
		driver.close();
	}

}

//public static Login_Page login = new Login_Page(driver);
//public static Hotel_SearchPage search = new Hotel_SearchPage(driver);
//public static Radio_Button button = new Radio_Button(driver);
//public static Booking_Page booking = new Booking_Page(driver);
//public static Order_Itinerary orderHistory = new Order_Itinerary(driver);

//		Select s = new Select(location);
//		s.selectByIndex(3);
// 		Select s1 = new Select(hotel);
//		s1.selectByIndex(2);
//		Select s2 = new Select(room);
//		s2.selectByValue("Double");
//		Select s3 = new Select(room_nos);
//		s3.selectByVisibleText("2 - Two");
//		Select s4 = new Select(adult);
//		s4.selectByIndex(2);
//		Select s5 = new Select(childroom);
//		s5.selectByValue("2");
//		Select s6 = new Select(card_type);
//		s6.selectByIndex(3);
//		Select s7 = new Select(month);
//		s7.selectByIndex(3);
//		Select s8 = new Select(year);
//		s8.selectByIndex(4);

//		Thread.sleep(5000);

//		sleep(5000);
//		TakesScreenshot sht = (TakesScreenshot) driver;
//		File srcFile = sht.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\Saravana\\eclipse-workspace\\Maven_Project\\Pictures\\snap1.png");
//		FileUtils.copyFile(srcFile, dest);

// 		TakesScreenshot sht2 = (TakesScreenshot) driver;
//		File srcFile2 = sht2.getScreenshotAs(OutputType.FILE);
//		File dest2 = new File("C:\\Users\\Saravana\\eclipse-workspace\\Maven_Project\\Pictures\\snap2.png");
//		FileUtils.copyFile(srcFile2, dest2);

//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		WebElement of POMs

//		driver = browserLaunch("chrome");
//		WebElement user = driver.findElement(By.name("username"));
//		sendValues(user, "Saravanakumar");
//		WebElement pass = driver.findElement(By.name("password"));
//		sendValues(pass, "O882QM");
//		WebElement login = driver.findElement(By.name("login"));
//		clickMethod(login);

//		WebElement location = driver.findElement(By.name("location"));
//		dropDown(location, "byindex", "3");

//		WebElement hotel = driver.findElement(By.name("hotels"));
//		dropDown(hotel, "byIndex", "2");
//		WebElement room = driver.findElement(By.name("room_type"));
//		dropDown(room, "byValue", "Double");

//		WebElement room_nos = driver.findElement(By.name("room_nos"));
//		dropDown(room_nos, "byVisibleText", "2 - Two");

//		WebElement fromdate = driver.findElement(By.name("datepick_in"));
//		sendValues(fromdate, "19-01-2022");

//		WebElement todate = driver.findElement(By.name("datepick_out"));
//		sendValues(todate, "20-01-2022");

//		WebElement adult = driver.findElement(By.name("adult_room"));
//		dropDown(adult, "byIndex", "2");	

//		WebElement childroom = driver.findElement(By.name("child_room"));
//		dropDown(childroom, "byValue", "2");

//		WebElement search = driver.findElement(By.name("Submit"));
//		clickMethod(search);

//		WebElement click = driver.findElement(By.name("radiobutton_0"));
//		clickMethod(click);		

//		WebElement con = driver.findElement(By.name("continue"));
//		clickMethod(con);
//		WebElement firstname = driver.findElement(By.name("first_name"));
//		sendValues(firstname, "Saravana");
//		WebElement lastname = driver.findElement(By.name("last_name"));
//		sendValues(lastname, "Kumar");
//		WebElement add = driver.findElement(By.name("address"));
//		sendValues(add, "PO 123, New Street, Brisbane- 12345");
//		WebElement cardnumber = driver.findElement(By.name("cc_num"));
//		sendValues(cardnumber, "1234123412341234");
//		WebElement card_type = driver.findElement(By.name("cc_type"));
//		dropDown(card_type, "byIndex", "3");
//		WebElement month = driver.findElement(By.name("cc_exp_month"));
//		dropDown(month, "byIndex", "3");
//		WebElement year = driver.findElement(By.name("cc_exp_year"));
//		dropDown(year, "byIndex", "4");
//		WebElement cvv = driver.findElement(By.name("cc_cvv"));
//		sendValues(cvv, "123");
//		WebElement book = driver.findElement(By.name("book_now"));
//		clickMethod(book);
//		WebElement his = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
//		his.click();

//		sendValues(login.getUsername(), "Saravanakumar");
//		sendValues(login.getPassword(), "O882QM");
//		clickMethod(login.getLogin());

//		dropDown(search.getLocation(), "byIndex", "3");
//		dropDown(search.getHotels(), "byIndex", "2");
//		dropDown(search.getRoomType(), "byValue", "Double");
//		dropDown(search.getRoomNos(), "byVisibletext", "2 - Two");
//		sendValues(search.getFromDate(), "09-02-2022");
//		sendValues(search.getToDate(), "10-02-2022");
//		dropDown(search.getAdultRoom(), "byIndex", "2");
//		dropDown(search.getChildRoom(), "byValue", "2");
//		clickMethod(search.getSearch());

//		clickMethod(button.getSelect());
//		clickMethod(button.getClickContinue());

//		sendValues(booking.getFirstName(), "Saravana");
//		sendValues(booking.getLastName(), "Kumar");
//		sendValues(booking.getAddress(), "PO 123, New Street, Brisbane- 12345");
//		sendValues(booking.getCardNumber(), "1234123412341234");
//		dropDown(booking.getCcType(), "byIndex", "3");

//		dropDown(booking.getExpMonth(), "byIndex", "3");
//		dropDown(booking.getExpYear(), "byIndex", "4");
//		sendValues(booking.getCvv(), "777");
//		clickMethod(booking.getBookNow());
//		implicitWait(10, TimeUnit.SECONDS);
//		clickMethod(orderHistory.getOrderHistory());