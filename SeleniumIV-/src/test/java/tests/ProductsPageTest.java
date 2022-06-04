package tests;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import foundation.AmpegTestBase;
import pages.ProductsPage;

public class ProductsPageTest extends AmpegTestBase{

	@Test
	public void goToProductsPage() {



		WebElement productsBtn = driver.findElement(By.xpath("//a[   text() = 'Products' and @class = 'main-item products']"));
				productsBtn.isDisplayed();
				productsBtn.click();
				
		ProductsPage.logo(driver).findElement(By.xpath("//img[@alt='AmpegLogo']"));


		assertEquals(productsBtn, productsBtn, "Products page should load");

	}

}
