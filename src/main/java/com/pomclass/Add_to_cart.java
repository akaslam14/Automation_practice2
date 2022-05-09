package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_to_cart {
	
	@FindBy(linkText = "Women")
	private WebElement Women;
	
	@FindBy(linkText = "Tops")
	private WebElement Tops;
	
	@FindBy(linkText = "Blouse")
	private WebElement Blouse;
	
	@FindBy(id = "add_to_cart")
	private WebElement add_to_cart;
	
	@FindBy(linkText = "Proceed to checkout")
	private WebElement Proceedtocheckout;
	
	@FindBy(name = "processAddress")
	private WebElement processAddress;
	
	@FindBy(name = "cgv")
	private WebElement cgv;
	
	@FindBy(name = "processCarrier")
	private WebElement processCarrier;
	
	@FindBy(linkText = "Sign out")
	private WebElement Signout;
	
	
	private WebDriver driver;
	
	public Add_to_cart(WebDriver driver3) {
		
		this.driver = driver3;
		PageFactory.initElements(driver, this);
	}
	
		
	public void Add_to_cart1(WebDriver driver3) {
	
	}

	public WebElement getWomen() {
		return Women;
	}

	public WebElement getTops() {
		return Tops;
	}

	public WebElement getBlouse() {
		return Blouse;
	}

	public WebElement getAdd_to_cart() {
		return add_to_cart;
	}

	public WebElement getProceedtocheckout() {
		return Proceedtocheckout;
	}
	public WebElement getprocessAddress() {
		return processAddress;
	}
	
	public WebElement getcgv() {
		return cgv;
	}
	
	public WebElement getprocessCarrier() {
		return processCarrier;
		
	}
	
	public WebElement getSignout() {
		return Signout;
	}
	

}
