package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonfunctions.actionclass;
import commonfunctions.commonfunctions;
import commonfunctions.takingscreenshot;
import pageobjects.removecart_pageobjects;

public class removecarttest extends commonfunctions {
	//Use action reusable method
	actionclass actionclas;
	@Test
	public void removecartoperation() {

		PageFactory.initElements(driver,removecart_pageobjects.class);
		removecart_pageobjects.addcardlogo.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//capture screenshot
		takingscreenshot.takeScreenshot(driver, "beforeremove");

		/*
		 * removecart_pageobjects.bikelight.click();
		 * removecart_pageobjects.jacket.click(); 
		 * removecart_pageobjects.onesie.click();
		 * removecart_pageobjects.saucelabsbackpack.click();
		 * removecart_pageobjects.tshirt.click();
		 * removecart_pageobjects.tshirtred.click();
		 */

		actionclas=new actionclass(driver, 20);
		actionclas.click(removecart_pageobjects.bikelight);
		actionclas.click(removecart_pageobjects.jacket);
		actionclas.click(removecart_pageobjects.onesie);
		actionclas.click(removecart_pageobjects.saucelabsbackpack);
		actionclas.click(removecart_pageobjects.tshirt);
		actionclas.click(removecart_pageobjects.tshirtred);

		//capture screenshot
		takingscreenshot.takeScreenshot(driver, "afterremove");
	}

}
