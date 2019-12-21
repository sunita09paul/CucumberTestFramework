package com.demo.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackgroundFormLocators {
	WebDriver driver;
	
	public BackgroundFormLocators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="middlename")
	public WebElement MiddleName;
	
	@FindBy(xpath = "//input[@class='number errorBorder ng-pristine ng-invalid ng-touched']")
	public WebElement DateofBirth;
	
	@FindBy(id="ssn")
	   public WebElement ssn;
	
    @FindBy(id="street")
	public WebElement Address;
	
    @FindBy(id="zip")
  	public WebElement Zipcode;
    
    @FindBy(name="city")
  	public WebElement City;
    
    @FindBy(id="phone")
  	public WebElement Phone;
    

    @FindBy(xpath="//Select[@class='stateWrap ng-pristine ng-valid errorBorder ng-touched']\r\n")
  	public WebElement state;
    
    @FindBy(xpath ="//div[@class='form-label noSelected selected_no']")
  	public WebElement WorkingInCalifornia;
     
    
    
}








