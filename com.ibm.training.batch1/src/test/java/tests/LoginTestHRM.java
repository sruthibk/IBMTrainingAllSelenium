package tests;

import org.testng.annotations.Test;

import pages.LoginPageHRM;
import pages.LoginPageHRM2;
import utility.Constants;

public class LoginTestHRM extends BaseTest {
	
	@Test
	public void verifyLoginfeature() throws Exception {
		
		LoginPageHRM2 lp = new LoginPageHRM2(driver);
		lp.enter_user(Constants.hrm_username);
		lp.enter_pass(Constants.hrm_password);
        lp.clickLoginButton();        

        lp.verifyApplicationTitle(driver.getTitle(), "OrangeHRM");

        lp.clickUserDropdown();

        lp.clickLogout();

        lp.verifyApplicationTitle(driver.getTitle(), "OrangeHRM");
	}

}
