package invenauto.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObjectBase;
import invenauto.foundation.CartConfirmationOverlay;
import invenauto.foundation.ProductTile;

public class HomePage extends PageObjectBase {

	@FindBy(how = How.ID, using="search_query_top")
	private WebElement searchTextBox;
	
	@FindBy(how = How.CSS, using="button[name='submit_search']")
	private WebElement searchTextButton;
	
	@FindBy(how = How.CSS, using="ul#homefeatured>li")
	private ArrayList<WebElement> tileElements;
	
	public HomePage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public HomePage navigate() {
		this.navigateToRelativeUrl();

		return this;
	}

	public HomePage enterSearchText(String searchText) {
		searchTextBox.sendKeys(searchText);

		return this;
	}

	public SearchResultsPage clickSearchTextButton() {
		searchTextButton.click();

		return new SearchResultsPage(this.getDriver(), this.getBaseUrl());
	}

	public ProductTile[] getProductTiles() {
		List<ProductTile> tiles = new ArrayList<ProductTile>();

		for(WebElement element:tileElements) {
			ProductTile tile = new ProductTile(element);
			tiles.add(tile);
		}

		return tiles.toArray(ProductTile[]::new);
	}

	public HomePage addProductToCart(String product) {
		ProductTile productTile = findProductTile(product);
		
		if(productTile != null) {
			productTile.addToCart();		
		}

		return this;
	}

	private ProductTile findProductTile(String product) {
		ProductTile[] productTiles = getProductTiles();

		for(ProductTile productTile:productTiles) {
			if(productTile.getTitle().equals(product)) {
				return productTile;
			}
		}		
		return null;
	}

	public String getCartConfirmationProduct() {
		CartConfirmationOverlay overlay = new CartConfirmationOverlay(this.getDriver(), this.getBaseUrl());
		overlay.WaitUntilDisplayed();
		
		return overlay.getAddedProduct();
	}

	@Override
	protected String getRelativeUrl() {
		return "index.php";
	}
}
