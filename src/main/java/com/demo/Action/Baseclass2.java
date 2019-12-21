package com.demo.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Baseclass2 {

	public static WebDriver driver = null;

public void initilize ()
{
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
		   
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
			driver.get("https://stgapplicant.vetty.co/login");

	}

	public void close() {
		driver.close();
	}
}
