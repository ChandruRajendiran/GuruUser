package org.Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	public static WebDriver driver;
	
	@Before
	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\com.guru99\\driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
	}
	
	@After
	public void driverClose() {
		// TODO Auto-generated method stub
		driver.quit();

	}

}
