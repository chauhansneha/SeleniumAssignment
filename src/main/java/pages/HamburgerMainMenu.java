package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HamburgerMainMenu extends BasePage {

	public HamburgerMainMenu(WebDriver driver) {
		super(driver);
	}

	// Elements Section
	/**************** Digital Contents and Devices ******************************/
	//Kindle option
	@FindBy(xpath = "//div[normalize-space()='Kindle']")
	WebElement kindleOption;

		
	// Action Methods Section
	/**************** Digital Contents and Devices ******************************/
	public void waitForKindleOption() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(kindleOption));
	}
	
	//Click kindle option
	public void clickKindle() {
		waitForKindleOption();
		kindleOption.click();
	}
}