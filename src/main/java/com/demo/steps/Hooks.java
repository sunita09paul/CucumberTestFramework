package com.demo.steps;

import com.demo.Action.Baseclass2;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	Baseclass2 obj1 = new Baseclass2();
	
	@Before
	public void initilizer() {
	obj1.initilize();
	System.out.println("hello");
	System.out.println("hiii");
	}
	
	@After
	public void closeDriver() {
		obj1.close();

		System.out.println("Hello sunita");
		System.out.println("hiii sunita");

	}
}
