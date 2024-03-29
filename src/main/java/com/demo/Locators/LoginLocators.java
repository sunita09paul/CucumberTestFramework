package com.demo.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocators {
	WebDriver driver;
	
	public LoginLocators(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver , this);
		
	}
	@FindBy(name="email")
	public WebElement Email;
	
	@FindBy(name="passowrd")
	public WebElement Password;
	
	
	@FindBy(xpath = "//button[text()='Log In']")
	 public WebElement Btn;

}
