package demoQa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObjectBase;

public class SliderPage extends PageObjectBase {

	@FindBy(how = How.ID, using="sliderContainer")
	WebElement element;

	public SliderPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	@Override
	protected String getRelativeUrl() {
		return "slider";
	}

	public SliderPage navigate() {
		super.navigateToRelativeUrl();

		return this;
	}

	public SliderPage setSliderValue(int value) {
		getControlExtensionFactory().getSliderControlExtension(element).setValue(value);

		return this;
	}

	public int getSliderValue() {
		return getControlExtensionFactory().getSliderControlExtension(element).getValue();	
	}
}
