package framework;

import org.openqa.selenium.WebElement;

public class RadioButtonControlExtension extends ControlExtensionBase {

	public RadioButtonControlExtension(WebElement element) {
		super(element);
	}

	public void select(String label) {
		getWrappedElement().click();
	}
}
