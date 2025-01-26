package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class removecart_pageobjects {
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	public static WebElement addcardlogo;
	
	@FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
	public static WebElement saucelabsbackpack;
	
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
	public static WebElement bikelight;
	
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")
	public static WebElement tshirt;
	
	@FindBy(xpath = "//button[@id='remove-sauce-labs-onesie']")
	public static WebElement onesie;
	
	@FindBy(xpath = "//button[@id='remove-sauce-labs-fleece-jacket']")
	public static WebElement jacket;
	
	@FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
	public static WebElement tshirtred;
	
	@FindBy(xpath = "//Button [@class='btn btn_secondary btn_small cart_button']")
	public static WebElement allbuttons;

}
