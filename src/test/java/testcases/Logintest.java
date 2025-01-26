package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonfunctions.actionclass;
import commonfunctions.commonfunctions;
import commonfunctions.log;
import commonfunctions.takingscreenshot;
import pageobjects.addcart_pageojects;
import pageobjects.login_pageobjects;

public class Logintest extends commonfunctions {
	
public String nameofproduct=null;


	public static void login() throws InterruptedException {
		PageFactory.initElements(driver,login_pageobjects.class);
		log.info("lOGIN PAGE OPENED");
		login_pageobjects.username.sendKeys(properties.getProperty("username"));
		login_pageobjects.password.sendKeys(properties.getProperty("password"));
		login_pageobjects.loginbutton.click();
		log.info("SUBMITTED BUTTON CLICKED SUCCESSFULLY");
		
		//screen capture
		takingscreenshot.takeScreenshot(driver, "loginpage");
	
	}
	public void getlable() {
		PageFactory.initElements(driver,addcart_pageojects.class);
		nameofproduct=addcart_pageojects.productname.getText();
		log.info("GOT THE LABLE");
	}
	
	
	@Test
	public void addcart() throws InterruptedException {
		login();
		getlable();
		Assert.assertEquals(nameofproduct,"Sauce Labs Fleece Jacket" );
		
	}

}

