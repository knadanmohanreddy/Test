package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
//import com.base.Testbase;
import com.pageobjects.LoginFunc;

public class Logintest extends Testbase{
	LoginFunc lf;
	//annotation
	
	public Logintest() {
		super();
		
	}
	
	@BeforeMethod
	public void ab() {
		launch();
		
		lf = new LoginFunc(driver);
		
	}
	@Test
	public void login() {
		lf.valid();
	}

}