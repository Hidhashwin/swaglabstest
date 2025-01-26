package testcases;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonfunctions.actionclass;
import commonfunctions.commonfunctions;
import pageobjects.addcart_pageojects;
import pageobjects.login_pageobjects;

public class addtocarttest extends commonfunctions {
	//Use action reusable method
	actionclass actionclas;
	
	@Test
	public void clickaddcart() {
		
		
		 PageFactory.initElements(driver,addcart_pageojects.class);
		 /* addcart_pageojects.sauce_labs_backpack.click();
		 * addcart_pageojects.sauce_labs_bike_light.click();
		 * addcart_pageojects.sauce_labs_bolt_tshirt.click();
		 * addcart_pageojects.sauce_labs_fleece_jacket.click();
		 * addcart_pageojects.sauce_labs_onesiek.click();
		 * addcart_pageojects.test_allthethings_tshirt_red.click();
		 */
		actionclas=new actionclass(driver, 20);
		actionclas.click(addcart_pageojects.sauce_labs_backpack);
		actionclas.click(addcart_pageojects.sauce_labs_bike_light);
		actionclas.click(addcart_pageojects.sauce_labs_bolt_tshirt);
		actionclas.click(addcart_pageojects.sauce_labs_fleece_jacket);
		actionclas.click(addcart_pageojects.sauce_labs_onesiek);
		actionclas.click(addcart_pageojects.test_allthethings_tshirt_red);
		
	}
	
}
