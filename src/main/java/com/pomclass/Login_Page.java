package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	
public class Login_Page {

	@FindBy(linkText = "Sign in")
	private WebElement signin;
	
	@FindBy(name = "email")
	private WebElement email;
	
	@FindBy(name = "passwd")
	private WebElement password;
	
	@FindBy(name = "SubmitLogin")
	private WebElement submitlogin;
	
	private WebDriver driver;
	
	public Login_Page(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitlogin() {
		return submitlogin;
	}
	
}
