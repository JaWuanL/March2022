package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SVT3ProPage {
	
	static WebElement element = null;
	
	public static WebElement image(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@src='images/SVT-3PRO_HEAD.jpg']"));
		return element;
	}

}
