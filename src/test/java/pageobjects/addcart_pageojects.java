package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addcart_pageojects {
	
	@FindBy(xpath = "//*[text()='Sauce Labs Fleece Jacket']")
	public static WebElement productname;
	//test
	
	@FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
	public static WebElement sauce_labs_backpack;
	
	@FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bike-light']")
	public static WebElement sauce_labs_bike_light;
	
	@FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	public static WebElement sauce_labs_bolt_tshirt;
	
	@FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-fleece-jacket']")
	public static WebElement sauce_labs_fleece_jacket;
	
	@FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-onesie']")
	public static WebElement sauce_labs_onesiek;
	
	@FindBy(xpath = "//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	public static WebElement test_allthethings_tshirt_red;

}
