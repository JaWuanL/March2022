package invenauto.tests;

import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

import framework.SeleniumTestBase;
import invenauto.foundation.InvenautoTestBase;

public class SanityTests extends InvenautoTestBase {
	@Test
	public void canLaunchWebDriver() {
		assertNotNull(this.getDriver(), "the webdriver should be launched.");
	}
}
