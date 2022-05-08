import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class SeleniumTestBase {
	private WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\temp\\chromedriver.exe");

		this.driver = new ChromeDriver();
	}

	@AfterMethod
	public void cleanup() {
		if(this.driver != null) {
			this.driver.quit();
		}
	}
	
	protected WebDriver getDriver() {
		return this.driver;
	}
}
