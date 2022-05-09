package com.Maven_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"./folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign in")).click();
		JavascriptExecutor rr = (JavascriptExecutor) driver;
		rr.executeScript("window.scrollTo(0, 300)");
		driver.findElement(By.name("email")).sendKeys("akaslam14@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Aslam@123");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.name("SubmitLogin")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Women")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Tops")).click();
		JavascriptExecutor ns = (JavascriptExecutor) driver;
		ns.executeScript("window.scrollTo(0, 500)");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Blouse")).click();
		ns.executeScript("window.scrollTo(0, 500)");
		driver.findElement(By.id("add_to_cart")).click();
		Thread.sleep(6000);
		driver.findElement(By.linkText("Proceed to checkout")).click();
		ns.executeScript("window.scrollTo(0, 700)");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Proceed to checkout")).click();
		Thread.sleep(3000);
		ns.executeScript("window.scrollTo(0, 700)");
		Thread.sleep(2000);
		driver.findElement(By.name("processAddress")).click();
		ns.executeScript("window.scrollTo(0, 600)");
		driver.findElement(By.name("cgv")).click();
		ns.executeScript("window.scrollTo(0, 500)");
		Thread.sleep(3000);
		driver.findElement(By.name("processCarrier")).click();
		ns.executeScript("window.scrollTo(0, 500)");
		
	}
	
}

