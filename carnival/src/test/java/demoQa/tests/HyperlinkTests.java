package demoQa.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import demoQa.pages.HyperlinkPage;

public class HyperlinkTests extends ControlExtensionTests {
	
  @Test
  public void canClickHyperlink() {
		String resultText = "Link has responded with staus 204 and status text No Content";

		String actualResultText = new HyperlinkPage(this.getDriver(), this.getBaseUrl())
				.navigate()
				.clickNoContentLink()
				.getMessage();

		assertEquals(actualResultText, resultText);		  
  }
}
