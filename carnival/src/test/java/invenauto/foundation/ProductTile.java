package invenauto.foundation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import framework.ControlExtensionBase;

public class ProductTile extends ControlExtensionBase {
	private By titleLocator = By.cssSelector("a.product-name");
	private By addToCartButtonLocator= By.cssSelector("a.ajax_add_to_cart_button");

	public ProductTile(WebElement element) {
		super(element);
	}

	public String getTitle() {
		return find(titleLocator).getAttribute("title");
	}

	public void addToCart() {
		WebElement element = find(addToCartButtonLocator);
		SyntheticClick(element);
	}
}
