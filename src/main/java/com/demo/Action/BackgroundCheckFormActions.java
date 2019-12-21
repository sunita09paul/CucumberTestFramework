package com.demo.Action;

import com.demo.Locators.BackgroundFormLocators;

public class BackgroundCheckFormActions extends LoginAction{

	public void Backgrougform() {
		BackgroundFormLocators loc1 = new BackgroundFormLocators(driver);
		loc1.MiddleName.sendKeys("Morgon");
		loc1.DateofBirth.sendKeys("09/09/1993");
		loc1.ssn.sendKeys("111-11-1111");
		loc1.Address.sendKeys("Pune");
		loc1.Zipcode.sendKeys("2222");
		loc1.Phone.sendKeys("9632587415");
		loc1.WorkingInCalifornia.click();
		

	}

}
