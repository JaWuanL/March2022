import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.PageObjectBase;

public class HomePage extends PageObjectBase {
	private static final String URL = "http://invenauto.tech/index.php";

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public HomePage navigate() {
		this.getDriver().navigate().to(URL);

		return this;
	}

	public HomePage enterSearchText(String searchText) {
		WebElement element = this.getDriver().findElement(By.id("search_query_top"));
		element.sendKeys(searchText);

		return this;
	}

	public SearchResultsPage clickSearchTextButton() {
		WebElement buttonElement = this.getDriver().findElement(By.cssSelector("button[name='submit_search']"));
		buttonElement.click();

		return new SearchResultsPage(this.getDriver());
	}

	public ProductTile[] getProductTiles() {
		List<ProductTile> tiles = new ArrayList<ProductTile>();
		List<WebElement> elements = this.getDriver().findElements(By.cssSelector("ul#homefeatured>li"));

		for(WebElement element:elements) {
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
		CartConfirmationOverlay overlay = new CartConfirmationOverlay(this.getDriver());
		overlay.WaitUntilDisplayed();
		
		return overlay.getAddedProduct();
	}
}
