package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Simple_AnnotationsTest {
	
	@BeforeSuite
	public void propertySetting() {
		System.out.println("property Setting");
		
	}	
		
	@BeforeClass
	public void geturl() {
		System.out.println("url");
		
		
	}	
		
		
	}

	
