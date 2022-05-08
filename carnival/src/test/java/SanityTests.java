import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

public class SanityTests extends SeleniumTestBase {
	@Test
	public void canLaunchWebDriver() {
		assertNotNull(this.getDriver(), "the webdriver should be launched.");
	}
}
