package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import foundation.AmpegTestBase;

public class SVT3ProTest extends AmpegTestBase{
	
	@Test
	public void canLoadSVT3ProDetails() {
		
		
		WebElement productsBtn = driver.findElement(By.xpath("//a[   text() = 'Products' and @class = 'main-item products']"));
		productsBtn.isDisplayed();
		productsBtn.click();
		
	
		WebElement svt = driver.findElement(By.xpath("//img[@alt='SVT Pro Series: Bass heads']"));
		svt.isDisplayed();
		svt.click();
		
		
		List<WebElement> elements = driver.findElements(By.xpath("//img[@alt='SVT-3PRO']"));
		for(WebElement element :elements) {
			System.out.println(element.getText());
		}
		
		WebElement svt3 = driver.findElement(By.xpath("//img[@alt='SVT-3PRO']"));
		svt3.isDisplayed();
		svt3.click();
		
		assertFalse(svt3 == productsBtn, "svt3 is not the same as productBtn");
	}


}
