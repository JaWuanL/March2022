package framework;

import static org.testng.Assert.assertFalse;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class SeleniumTestBase {
	private WebDriver driver;
	private String baseUrl;
	
	protected SeleniumTestBase(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","/Users/jawuanlang/git/March2022/carnival/src/test/resources/mac/chromedriver");

		this.driver = new ChromeDriver();
		
		SetOptions();

	}

	@AfterMethod
	public void cleanup() {
		if(this.driver != null) {
			this.driver.quit();
		}
	}

	protected String getBaseUrl() {
		return baseUrl;
	}
	
	protected WebDriver getDriver() {
		return this.driver;
	}
	
	private void SetOptions() {
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.driver.manage().window().maximize();
	}
}
