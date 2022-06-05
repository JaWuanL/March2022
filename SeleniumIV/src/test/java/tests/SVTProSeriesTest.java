package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import foundation.AmpegTestBase;
import framework.TestBase;


public class SVTProSeriesTest extends AmpegTestBase{
	



	@Test
	public void goToSVTProSeriesDetails() {
		

		WebElement productsBtn = driver.findElement(By.xpath("//a[   text() = 'Products' and @class = 'main-item products']"));
				productsBtn.isDisplayed();
				productsBtn.click();
				
				
		
		WebElement svt = driver.findElement(By.xpath("//img[@alt='SVT Pro Series: Bass heads']"));
				svt.isDisplayed();
				svt.click();
				
		assertTrue(productsBtn != svt, "productsBtn is not svt");
	}

}
