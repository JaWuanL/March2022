import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import framework.SeleniumTestBase;

public class ProductTests extends SeleniumTestBase{
	
  @Test
  public void canGetProductTiles() {
	  int tileCount = 8;
	  
	  ProductTile[] tiles = new HomePage(getDriver())
	  .navigate()
	  .getProductTiles();
	  
	  assertEquals(tiles.length, tileCount, "all of the tiles should be returned.");
  }
}
