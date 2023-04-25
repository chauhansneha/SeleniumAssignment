package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage {

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	// Elements Section
	@FindBy(id = "buy-now-button")
	WebElement buyNowBtn;

	// Action Methods Section
	public void waitForBuyNowbtn() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(buyNowBtn));
	}

	public void clickBuyNow() {
		waitForBuyNowbtn();
		buyNowBtn.click();
	}

}
