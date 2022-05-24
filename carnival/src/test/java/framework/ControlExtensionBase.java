package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.interactions.Actions;

public abstract class ControlExtensionBase {
	private WebElement wrappedElement;

	public ControlExtensionBase(WebElement element) {
		this.wrappedElement = element;
	}

	protected WebElement find(By locator) {
		WebElement element = this.wrappedElement.findElement(locator);
		return element;
	}

	protected WebElement getWrappedElement() {
		return wrappedElement;
	}

	protected void MoveToElement(WebElement element) {
		WebDriver driver = getDriverFrom(element);

		new Actions(driver)
		.moveToElement(element)
		.build()
		.perform();		
	}

	protected void ScrollToElement(WebElement element) {
		WebDriver driver = getDriverFrom(element);

		((JavascriptExecutor)driver).executeScript("javascript:window.scrollBy(250,350)");	
	}

	private WebDriver getDriverFrom(WebElement element) {
		return ((WrapsDriver)element).getWrappedDriver();
	}

	protected void SyntheticClick(WebElement element) {
		WebDriver driver = getDriverFrom(element);

		((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);	
	}		
}
