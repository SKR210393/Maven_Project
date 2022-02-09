package com.Maven_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.pom.cls.SignIn_Page;

public class Test_Runner extends Base_Class {

	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {

		driver = browserLaunch("chrome");

		getURL("http://automationpractice.com/index.php");
//	WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
//	clickMethod(sign);

//	WebElement email = driver.findElement(By.name("email"));
//	sendValues(email, "skrp@gmail.com");

//	WebElement pass = driver.findElement(By.name("passwd"));
//	sendValues(pass, "Skrp@1");

//		WebElement login = driver.findElement(By.id("SubmitLogin"));
//		clickMethod(login);

// Sign_In using POM class 

		SignIn_Page si = new SignIn_Page(driver);
		clickMethod(si.getSignin());

		sendValues(si.getEmail(), "skrp@gmail.com");

		sendValues(si.getPass(), "Skrp@1");

		clickMethod(si.getLogin());

		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		clickMethod(tshirt);

		WebElement tshirt2 = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		clickMethod(tshirt2);
		
		driver.switchTo().frame(0);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement units = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		units.click();
		
		WebElement size = driver.findElement(By.name("group_1"));
		Select s = new Select(size);
		s.selectByIndex(2);
		
		WebElement color = driver.findElement(By.name("Blue"));
		color.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement addcart = driver.findElement(By.xpath("//button[@class='exclusive']"));
		clickMethod(addcart);
		
		WebElement checkout1 = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		clickMethod(checkout1);
		
		WebElement checkout2 = driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]"));
		clickMethod(checkout2);

		WebElement checkout3 = driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]"));
		clickMethod(checkout3);

		WebElement terms = driver.findElement(By.name("cgv"));
		clickMethod(terms);

		WebElement checkout4 = driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]"));
		clickMethod(checkout4);

//		driverClose();

	}

}
