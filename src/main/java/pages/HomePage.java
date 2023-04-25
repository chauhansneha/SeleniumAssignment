package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Elements
	// Hamburger Icon
	@FindBy(xpath = "//i[@class='hm-icon nav-sprite']")
	WebElement hamburgerIcon;

	// Action Methods
	// Click Hamburger Icon
	public void clickHamburger() {
		hamburgerIcon.click();
	}
}
