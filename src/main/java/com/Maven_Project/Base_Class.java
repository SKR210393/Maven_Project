package com.Maven_Project;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver; // Null Driver

//	Browser Launch

	public static WebDriver browserLaunch(String browse) {

		if (browse.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browse.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");

			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		return driver;

	}

//	Close

	public static void driverClose() {
		driver.close();
	}

//	Quit
	public static void quitMethod() {
		driver.quit();
	}

//	NavigateURL
	public static void navigateTo(String url) {

		driver.navigate().to(url);
	}

	// NavigateBack
	public static void navigateBack() {
		driver.navigate().back();
	}

//	Navigate Forward

	public static void navigateForward() {
		driver.navigate().forward();

	}

//	Navigate refresh
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

//	GetURL

	public static void getURL(String url) {
		driver.get(url);
	}

//	DropDown Method

	public static void dropDown(WebElement element, String type, String data) {

		Select s = new Select(element);
		if (type.equalsIgnoreCase("byIndex")) {
			int value = Integer.parseInt(data);
			s.selectByIndex(value);
		}

		else if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(data);

		}

		else if (type.equalsIgnoreCase("byVisibleText")) {

			s.selectByVisibleText(data);

		}

	}

	// Get Title

	public static void getTitle() {
		driver.getTitle();

	}

// Click

	public static void clickMethod(WebElement element) {
		element.click();
	}

//	 SendKeys

	public static void sendValues(WebElement element, String value) {
		element.sendKeys(value);

	}

//	Sleep

	public static void sleep(int millsec) throws Throwable {
		Thread.sleep(millsec);
	}

	public static void takeSnap() throws Throwable {

		TakesScreenshot sht = (TakesScreenshot) driver;
		File srcFile = sht.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Saravana\\eclipse-workspace\\Maven_Project\\Pictures\\snap.png");
		FileUtils.copyFile(srcFile, dest);

	}
//	IsDisplayed

	public static void isDisplayed(WebElement element) {

		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}

//	IsSelected

	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}

//	IsEnabled

	public static void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}

// Implicit Wait

	public static void implicitWait(int seconds, TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(seconds, format);

	}

//	Explicit Wait
	public static void explicitWait(int secconds, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

//	Fluent Wait
	public static void fluentWait(int timeoutseconds, int pollingseconds, TimeUnit format) {

		Wait wait = new FluentWait(driver).withTimeout(30, format).pollingEvery(5, format).ignoring(Exception.class);
		
	}
	
	
}
