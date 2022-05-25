package framework;

import org.openqa.selenium.WebElement;

public class HyperlinkControlExtension extends ControlExtensionBase {

	public HyperlinkControlExtension(WebElement element) {
		super(element);
	}

	public void click() {
		getWrappedElement().click();		
	}
}
