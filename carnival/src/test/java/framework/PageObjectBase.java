package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageObjectBase {
	private WebDriver driver;
	private String baseUrl;
	private ControlExtensionFactory _controlExtensionFactory;
	
	protected abstract String getRelativeUrl();

	protected PageObjectBase(WebDriver driver, String baseUrl) {
		this.driver = driver;
		this.baseUrl = baseUrl;

		_controlExtensionFactory = new ControlExtensionFactory();

		PageFactory.initElements(driver, this);
	}

	protected void navigateToRelativeUrl() {
		String relativeUrl = getRelativeUrl();
		driver.navigate().to(baseUrl + relativeUrl);
	}

	protected WebElement waitForElementVisible(By locator, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

		return element;
	}

	protected String getBaseUrl() {
		return this.baseUrl;
	}
	
	protected WebDriver getDriver() {
		return this.driver;
	}
	
	public ControlExtensionFactory getControlExtensionFactory() {
		return _controlExtensionFactory;
	}
}
