import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SanityTests {
	private WebDriver driver;

	@Test
	public void canLaunchWebDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\temp\\chromedriver.exe");

		this.driver = new ChromeDriver();

		assertNotNull(driver, "the webdriver should be launched.");
	}

	@AfterMethod
	public void cleanup() {
		if(this.driver != null) {
			this.driver.quit();
		}
	}
}
