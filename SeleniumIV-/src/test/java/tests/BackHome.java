package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import foundation.AmpegTestBase;

public class BackHome extends AmpegTestBase{
	
	@Test
	public void goBackToHomePage() {
		String url = driver.getCurrentUrl();
		
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
		
		WebElement homeBtn = driver.findElement(By.xpath("//a[   text() = 'Home']"));
		homeBtn.isDisplayed();
		homeBtn.click();
		
		
		assertEquals(url, "https://ampeg.com/index.html");
	}

}
