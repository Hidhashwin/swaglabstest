package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login_pageobjects {
	
	@FindBy(id = "user-name")
	public static WebElement username;
	
	@FindBy(id = "password")
	public static WebElement password;
	
	@FindBy(id = "login-button")
	public static WebElement loginbutton;

}
