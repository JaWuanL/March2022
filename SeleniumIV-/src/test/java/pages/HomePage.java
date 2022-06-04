package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	static WebElement element = null;
	
	public static WebElement image(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//img[@src='/images/logo/ampeg-pride-2022.png']"));
		return element;
	}

}
