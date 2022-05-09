package com.Maven_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pomclass.Add_to_cart;
import com.pomclass.Login_Page;
import com.sdc.File_Reader_Manager;
import com.sdc.Project_Object_Manager;

public class Runner_Class extends BaseClass{
	

	public static WebDriver driver = browserLaunch("chrome");	

	public static Project_Object_Manager pom = new Project_Object_Manager(driver);
	public static void main(String[] args) throws Throwable {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl();
		
		urlLaunch(url);
		clickonElement(pom.getInstanceLogin().getSignin());
		
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getusername();
		
		passvalues(pom.getInstanceLogin().getEmail(), username);
		
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getpassword();
		passvalues(pom.getInstanceLogin().getPassword(), password);
		clickonElement(pom.getInstanceLogin().getSubmitlogin());
		
		
		clickonElement(pom.getInstanceAdd_to_cart().getWomen());
		clickonElement(pom.getInstanceAdd_to_cart().getTops());
		clickonElement(pom.getInstanceAdd_to_cart().getBlouse());
		clickonElement(pom.getInstanceAdd_to_cart().getAdd_to_cart());
		clickonElement(pom.getInstanceAdd_to_cart().getProceedtocheckout());
		
		clickonElement(pom.getInstanceAdd_to_cart().getProceedtocheckout());
		clickonElement(pom.getInstanceAdd_to_cart().getprocessAddress());
		clickonElement(pom.getInstanceAdd_to_cart().getcgv());
		clickonElement(pom.getInstanceAdd_to_cart().getprocessCarrier());
		clickonElement(pom.getInstanceAdd_to_cart().getSignout());
		
	
		
	}
}
