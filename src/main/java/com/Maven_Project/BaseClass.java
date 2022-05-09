package com.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	

	public static WebDriver driver;
		
	
	public static WebDriver browserLaunch(String Browsername) {
		
		if (Browsername.equalsIgnoreCase("chrome"));

		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\folder\\chrome\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static void urlLaunch(String url) {
		
		driver.get(url);
	}

	public static void closeTheBrowser() {

		driver.close();
	}

	public static void passvalues(WebElement values, String element) {
		
		values.sendKeys(element);
		
	}
	
	public static void clickonElement(WebElement element) {
		element.click();
	}
	
	public static void quit() {
		driver.quit();
	}

	public static void Alert(WebElement element) {
		element.click();
	}
	
	public static void Dropdown(WebElement element) {
		element.click();
	}
	
	
	
	
	
	
	
	
	public static void Gettext(WebElement element) {
		element.getText();
	}
	
	public static void GetTagName(WebElement element) {
		element.getTagName();
		
	}

}





