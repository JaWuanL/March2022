package tests;

import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

import foundation.AmpegTestBase;

public class SanityTests extends AmpegTestBase {
	
	@Test
	public void canLaunchWebDriver() {
		assertNotNull(this.getDriver(), "the webdriver should be launched.");
	}

}
