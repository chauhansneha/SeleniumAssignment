package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HamburgerMainMenu;
import pages.HamburgerSubMenu;
import pages.HomePage;
import pages.ProductPage;
import pages.SignInPage;

public class BuyNow extends BaseClass {

	@Test(priority = 0, groups = { "master", "regression" })
	public void test_buynow_withoutSignIn() {

		logger.info("***  Starting test method test_buynow_withoutSignIn() ***");
		try {
			HomePage hp = new HomePage(driver);
			HamburgerMainMenu hmm = new HamburgerMainMenu(driver);
			HamburgerSubMenu hsm = new HamburgerSubMenu(driver);
			ProductPage pp = new ProductPage(driver);
			SignInPage si = new SignInPage(driver);

			hp.clickHamburger();
			logger.info("Clicked on Hamburger Icon");

			hmm.clickKindle();
			logger.info("Clicked on Hamburger Main Menu Option");

			hsm.clickKindle();
			logger.info("Clicked on Hamburger Sub Menu Option");

			pp.clickBuyNow();
			logger.info("Clicked on Product Page Buy Now Button");

			si.waitForSignInLabel();
			String actualEmailLabelTxt = si.getEmailLabelTxt();

			logger.info("Validating expected message");

			Assert.assertTrue("Enter mobile phone number or email".equalsIgnoreCase(actualEmailLabelTxt.trim())
					|| "E-mail address or mobile phone number".equalsIgnoreCase(actualEmailLabelTxt.trim()));

		} catch (Exception e) {
			logger.error("Test failed");
			Assert.fail();
		}
		logger.info("***  Finished test method test_buynow_withoutSignIn() ***");

	}

}
