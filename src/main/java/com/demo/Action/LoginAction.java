package com.demo.Action;

import com.demo.Locators.LoginLocators;

public class LoginAction extends Baseclass2 {
	
	public void loginfunction() {
		driver.get("https://stgapplicant.vetty.co/login");
		
		LoginLocators loc = new LoginLocators(driver);
		
		
		loc.Email.sendKeys("steve@getnada.com");
		loc.Password.sendKeys("123456");
		loc.Btn.click();
	}

}
