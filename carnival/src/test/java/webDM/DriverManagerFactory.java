package webDM;

import org.openqa.selenium.WebDriver;


public abstract class DriverManagerFactory{
	private WebDriver driver;

	public DriverManagerFactory() {
	}

	public DriverManagerFactory(WebDriver driver) {
	}

	protected WebDriver getDriver() {
		return driver;
	}

}