package framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ControlExtensionFactory {

	public TextBoxControlExtension getTextbox(WebElement element) {
		return new TextBoxControlExtension(element);	
	}

	public RadioButtonGroupControlExtension getRadioButtonGroup(WebElement element) {
		return new RadioButtonGroupControlExtension(element);
	}
	
	public SliderControlExtension getSliderControlExtension(WebElement element) {
		return new SliderControlExtension(element);
	}

	public Select getSelect(WebElement element) {
		return new Select(element);		
	}
}
