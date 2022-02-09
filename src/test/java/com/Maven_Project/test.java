package com.Maven_Project;

import org.openqa.selenium.WebDriver;

public class test extends Base_Class {

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = browserLaunch("chrome");

		driver.navigate().to("https://www.amazon.com/");
		String title = driver.getTitle();

		System.out.println(title);


		
		
		getTitle();	
	
	
}
}