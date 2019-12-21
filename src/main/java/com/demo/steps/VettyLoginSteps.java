package com.demo.steps;

import com.demo.Action.BackgroundCheckFormActions;
import com.demo.Action.LoginAction;

import cucumber.api.java.en.When;

public class VettyLoginSteps {
	
	
	@When("^user successfully$")
	public void user_successfully() throws Throwable {

		LoginAction action = new LoginAction();
		action.loginfunction();
	}
	
	@When("^User Enter the valid info in BackgroudCheck form$")
	public void user_Enter_the_valid_info_in_BackgroudCheck_form() throws Throwable {
		
		BackgroundCheckFormActions obj = new BackgroundCheckFormActions();
		obj.Backgrougform();
	}
	
	

}
