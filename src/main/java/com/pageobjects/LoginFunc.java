package com.pageobjects;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class LoginFunc extends Testbase {
	
	 @FindBy(id="email")
	 WebElement usr;
	 
	 @FindBy(id="password")
	 WebElement pwd;

	 @FindBy(xpath="//button[text()='Login']")
	 WebElement btn;
	 
	 public LoginFunc(WebDriver driver) {
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	 public HomePage valid() {
		 
		 usr.sendKeys(prop.getProperty("username"));

		 pwd.sendKeys(prop.getProperty("password"));
		 btn.click();
		 return new HomePage();
		 
	 }
	 
 

}