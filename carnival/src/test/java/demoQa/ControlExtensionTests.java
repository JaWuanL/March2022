package demoQa;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import framework.SeleniumTestBase;

public class ControlExtensionTests extends SeleniumTestBase {
	@Test
	public void canEnterTextIntoTextboxes() {
		String fullName = "Dennis Taylor";
		String address = "110 Main";

		TextBoxPage page = new TextBoxPage(this.getDriver())
				.navigate()
				.enterFullName(fullName)
				.enterCurrentAddress(address);
		
		String enteredFullName = page.getFullName();
		String enteredAddress = page.getAddress();
		
		assertEquals(enteredFullName, fullName, "the text sent to the full name textbox should match the textbox current value");
		assertEquals(enteredAddress, address, "the text sent to the address textbox should match the textbox current value");
	}
}
