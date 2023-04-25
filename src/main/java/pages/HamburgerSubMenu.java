package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HamburgerSubMenu extends BasePage {

	public HamburgerSubMenu(WebDriver driver) {
		super(driver);
	}

	// Elements
	/**************** Kindle -> Kindle E-Readers ******************************/
	// Click kindle option
	@FindBy(xpath = "//ul[@class='hmenu hmenu-visible hmenu-translateX']//a[@class='hmenu-item'][normalize-space()='Kindle']")
	WebElement kindleInSubMenu;

	// Action Methods
	/**************** Kindle -> Kindle E-Readers ******************************/
	public void waitForKindleOption() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(kindleInSubMenu));
	}

	// Click kindle option
	public void clickKindle() {
		waitForKindleOption();
		kindleInSubMenu.click();
	}
}