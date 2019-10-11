package org.Stepdefinition;

import java.util.List;

import org.cucumber.com.guru99.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GuruUser extends Base{
		
	
	
	GuruHome h=new GuruHome();
	
	@Given("user is on Guru Telecom page")
	public void user_is_on_Guru_Telecom_page() {
		launch("http://demo.guru99.com/");
	}

	@When("user enters all required filed in all the pages")
	public void user_enters_all_required_filed_in_all_the_pages(io.cucumber.datatable.DataTable dataTable) {
	  
		List<String>list=dataTable.asList(String.class);
		click(h.getPass());
		click(h.getCustomer());
		type(h.getFname(),list.get(0));
		type(h.getLname(),list.get(1));
		
		type(h.getEmail(),list.get(2));
		
		type(h.getMessage(),list.get(3));
		
		type(h.getTelephoneno(),list.get(4));
	
	}

	@When("user clicks submit")
	public void user_clicks_submit() {
		
	click(h.getSubmit());

	}

	@Then("user should see payment")
	public void user_should_see_payment() {
	   
		System.out.println("User in Add customer page");
	}
}

