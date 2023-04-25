package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage extends BasePage {

	public SignInPage(WebDriver driver) {
		super(driver);
	}

	// Elements Section
	@FindBy(xpath = "//h1[normalize-space()='Sign in']")
	WebElement signInLabelTxt;

	@FindBy(xpath = "//label[@for='ap_email']")
	WebElement emailLabelTxt;

	// Action Methods Section
	public void waitForSignInLabel() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(signInLabelTxt));
	}

	public Boolean emailLabelIsDisplayed() {
		return emailLabelTxt.isDisplayed();
	}

	public String getEmailLabelTxt() {
		try {
			return emailLabelTxt.getText();
		} catch (Exception e) {
			return (e.getMessage());
		}
	}
}
