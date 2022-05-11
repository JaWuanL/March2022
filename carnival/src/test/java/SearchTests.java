import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import framework.SeleniumTestBase;

public class SearchTests extends SeleniumTestBase {
	@Test
	public void canSearchUsingSearchText() {
		String searchText = "t-shirts";

		String headerText = new HomePage(this.getDriver())
				.navigate()
				.enterSearchText(searchText)
				.clickSearchTextButton()
				.getHeaderText();

		assertEquals(headerText, searchText, "header text should match the search text.");
	}

	@Test
	public void someNewTest() {

		String text = new HomePage(getDriver())
				.navigate()
				.clickSearchTextButton()
				.getHeaderText();
	}
}
