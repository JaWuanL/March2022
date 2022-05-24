package invenauto.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import framework.SeleniumTestBase;
import invenauto.foundation.InvenautoTestBase;
import invenauto.pages.HomePage;

public class SearchTests extends InvenautoTestBase {
	@Test
	public void canSearchUsingSearchText() {
		String searchText = "t-shirts";

		String headerText = new HomePage(this.getDriver(), this.getBaseUrl())
				.navigate()
				.enterSearchText(searchText)
				.clickSearchTextButton()
				.getHeaderText();

		assertEquals(headerText, searchText, "header text should match the search text.");
	}

	@Test
	public void someNewTest() {

		String text = new HomePage(getDriver(), this.getBaseUrl())
				.navigate()
				.clickSearchTextButton()
				.getHeaderText();
	}
}
