package demoQa.tests;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import demoQa.foundation.DemoQaTestBase;
import demoQa.pages.SelectPage;

public class SelectTests extends DemoQaTestBase {
	@Test
	public void canSetSelectValue() {
		String value = "Purple";

		String actualValue = new SelectPage(getDriver(), getBaseUrl())
				.navigate()
				.setOldStyleValue(value)
				.getOldStyleValue();

		assertEquals(actualValue, value);
	}

	@Test
	public void canGetAllOptions() {
		String[] options = {
				"Red",
				"Blue",
				"Green",
				"Yellow",
				"Purple",
				"Black",
				"White",
				"Voilet",
				"Indigo",
				"Magenta",
				"Aqua"
		};

		String[] actualOptions = new SelectPage(getDriver(), getBaseUrl())
				.navigate()
				.getOldStyleOptions();

		assertEquals(actualOptions, options);
	}
}
