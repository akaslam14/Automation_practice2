package com.sdc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader () throws Exception {
		
		File f = new File("C:\\Users\\AKBAR\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\sdc\\Automation.properties");
			
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		p.load(fis);
	
	}
	
	public String geturl() throws Throwable {
		String url = p.getProperty("url");
		return url;
		
}

	public String getusername() throws Throwable {
		
		String username = p.getProperty("username");

		return username;
	}
	
	public String getpassword() throws Throwable {
		String password = p.getProperty("password");
		return password;
	}
}
		



