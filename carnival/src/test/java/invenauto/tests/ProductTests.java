package invenauto.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import framework.SeleniumTestBase;
import invenauto.foundation.InvenautoTestBase;
import invenauto.foundation.ProductTile;
import invenauto.pages.HomePage;

public class ProductTests extends InvenautoTestBase {

	@Test
	public void canGetProductTiles() {
		int tileCount = 8;

		ProductTile[] tiles = new HomePage(this.getDriver(), this.getBaseUrl())
				.navigate()
				.getProductTiles();

		assertEquals(tiles.length, tileCount, "all of the tiles should be returned.");
	}

	@Test
	public void addProductToCart() {
		String product = "Printed Summer Dress";

		String cartConfirmationProduct = new HomePage(this.getDriver(), this.getBaseUrl())
				.navigate()
				.addProductToCart(product)
				.getCartConfirmationProduct();

		assertEquals(cartConfirmationProduct, product, "product should be added to cart.");
	}
}
