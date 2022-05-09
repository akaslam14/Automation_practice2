package com.sdc;

import org.openqa.selenium.WebDriver;

import com.pomclass.Add_to_cart;
import com.pomclass.Login_Page;


public class Project_Object_Manager {
	
	
	public WebDriver driver;
	
	private Login_Page nn;

	public Project_Object_Manager(WebDriver driver2) {
		
		this.driver = driver2;
	}

		public Login_Page getInstanceLogin() {
		
		if (nn == null) {
	
			nn = new Login_Page(driver);
		}
		
		return nn;
	}
		
	
		private Add_to_cart nr;
		
		public Add_to_cart getInstanceAdd_to_cart() {
			
			if (nr ==null) {
		
				nr = new Add_to_cart(driver);
			}
			
			return nr;
		}
		
	
}
