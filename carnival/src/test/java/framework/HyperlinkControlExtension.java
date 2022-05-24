package framework;

import org.openqa.selenium.WebElement;

import framework.ControlExtensionBase;

public class HyperlinkControlExtension extends ControlExtensionBase {

	public HyperlinkControlExtension(WebElement element) {
		super(element);
	}

	public void click() {
		getWrappedElement().click();		
	}
}
