package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtonGroupControlExtension extends ControlExtensionBase {

	public RadioButtonGroupControlExtension(WebElement element) {
		super(element);
	}

	public RadioButtonControlExtension get(String label) {		
		By locator = By.xpath(".//label[text()='"+label+"']");
		WebElement element = getWrappedElement().findElement(locator);
		
		return new RadioButtonControlExtension(element);
	}
}
