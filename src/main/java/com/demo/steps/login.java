package com.demo.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	
	@Given("^User enter url$")
	public void user_enter_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user enter username$")
	public void user_enter_username() throws Throwable {
		System.out.println("Username:Sunita");
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user enter username \"([^\"]*)\"$")
	public void user_enter_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@When("^user enter password \"([^\"]*)\"$")
	public void user_enter_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user enter password$")
	public void user_enter_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user clicks on button$")
	public void user_clicks_on_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}



}
