package demoQa.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import demoQa.foundation.DemoQaTestBase;
import demoQa.pages.RadioButtonPage;

public class RadioButtonTests extends DemoQaTestBase {

	@Test
	public void canSelectYesRadioButton() {
		String selectedText = "You have selected Yes";

	
		
		
		//String message = new RadioButtonPage(this.getDriver(), this.getBaseUrl())
		//		.navigate()
		//		.clickYesRadioButton()
		//		.getMessage();

		//assertEquals(message, selectedText);	  
	}

	@Test
	public void canSelectImpressiveRadioButton() {
		String selectedText = "You have selected Impressive";

		String message = new RadioButtonPage(this.getDriver(), this.getBaseUrl())
				.navigate()
				.clickImpressiveRadioButton()
				.getMessage();

		assertEquals(message, selectedText);	  
	}
}
