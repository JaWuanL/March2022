package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
	
	static WebElement element = null; 
	
	public static WebElement logo(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//img[@alt='AmpegLogo']"));
		return element; 
	}

}
