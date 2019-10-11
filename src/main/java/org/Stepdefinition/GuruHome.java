package org.Stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuruHome {
	
	public GuruHome() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(Hook.driver, this);
	}
	
	@FindBy(xpath="//a[text()='Telecom Project']")
	private WebElement pass;
	
	@FindBy(xpath="//a[text()='Add Customer']")
	private WebElement customer;
	
	@FindBy(id="fname")
	private WebElement fname;
	
	@FindBy(id="lname")
	private WebElement lname;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(xpath="//textarea[@placeholder='Enter your address']")
	private WebElement message;
	
	@FindBy(id="telephoneno")
	private WebElement telephoneno;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement submit;
	
	public WebElement getPass() {
		return pass;
	}

	public WebElement getCustomer() {
		return customer;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getTelephoneno() {
		return telephoneno;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
