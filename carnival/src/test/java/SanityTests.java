import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

import framework.SeleniumTestBase;

public class SanityTests extends SeleniumTestBase {
	@Test
	public void canLaunchWebDriver() {
		assertNotNull(this.getDriver(), "the webdriver should be launched.");
	}
}
