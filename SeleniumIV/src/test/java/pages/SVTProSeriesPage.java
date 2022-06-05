package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SVTProSeriesPage {
	
	static WebElement element = null;
	
	public static WebElement image(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//*[@src='images/S_proseries.gif']"));
		return element;
	}

}
