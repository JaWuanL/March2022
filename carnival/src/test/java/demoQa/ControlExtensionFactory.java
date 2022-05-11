package demoQa;

import org.openqa.selenium.WebElement;

public class ControlExtensionFactory {

	public TextBoxControlExtension getTextbox(WebElement element) {
		return new TextBoxControlExtension(element);	
	}
}
