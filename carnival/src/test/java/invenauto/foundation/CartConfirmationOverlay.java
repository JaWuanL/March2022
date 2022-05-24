package invenauto.foundation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.PageObjectBase;

public class CartConfirmationOverlay extends PageObjectBase {

	private WebElement rootElement;
	private By addedProductLocator = By.cssSelector("span#layer_cart_product_title");

	public CartConfirmationOverlay(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);

		WebElement element = this.getDriver().findElement(By.cssSelector("div#layer_cart"));
		this.rootElement = element;
	}

	public String getAddedProduct() {
		WebElement element = this.rootElement.findElement(addedProductLocator);

		return element.getText();
	}

	public void WaitUntilDisplayed() {	
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 30);
		wait.until(ExpectedConditions.attributeContains(this.rootElement, "style", "display: block;"));
	}

	@Override
	protected String getRelativeUrl() {
		return null;
	}
}
