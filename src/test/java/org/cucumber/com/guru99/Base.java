package org.cucumber.com.guru99;

import org.Stepdefinition.Hook;
import org.openqa.selenium.WebElement;

public class Base {

	public void click(WebElement ele) {
		// TODO Auto-generated method stub
		
		ele.click();

	}
	
	public void type(WebElement ele, String name) {
		// TODO Auto-generated method stub
		
		ele.sendKeys(name);

	}
	public void launch(String url) {
		// TODO Auto-generated method stub
		
	Hook.driver.get(url);

	}
	
	
}
