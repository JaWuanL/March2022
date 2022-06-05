package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import foundation.AmpegTestBase;

public class ClassicSeriesPageTest extends AmpegTestBase{
	
	@Test
 	public void goToClassicSeriesPage() {
		String text = "The Classic Series is all about the Ampeg SVT. We pioneered Super-Valve Technology in the 1960s and continue to offer the ultimate, top-performance gear to the world’s most demanding bassists.";
		
		WebElement productsBtn = driver.findElement(By.xpath("//a[   text() = 'Products' and @class = 'main-item products']"));
		productsBtn.isDisplayed();
		productsBtn.click();
		
		WebElement classicSeries = driver.findElement(By.xpath("//img[@alt='Classic Series: Bass heads & enclosures']"));
			classicSeries.isDisplayed();
			classicSeries.click();
	}

}
