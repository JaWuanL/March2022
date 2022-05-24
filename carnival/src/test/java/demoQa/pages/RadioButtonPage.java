package demoQa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObjectBase;
import framework.RadioButtonControlExtension;

public class RadioButtonPage extends PageObjectBase {
	@FindBy(how = How.XPATH, using="//p[contains(text(), 'You have selected')]")
	private WebElement message;

	@FindBy(how = How.XPATH, using="//div[text()='Do you like the site?']/..")
	private WebElement radioGroupElement;

	public RadioButtonPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public RadioButtonPage navigate() {
		super.navigateToRelativeUrl();

		return this;
	}

	public RadioButtonPage clickYesRadioButton() {
		selectRadioButton("Yes");

		return this;
	}

	public RadioButtonPage clickNoRadioButton() {
		selectRadioButton("No");

		return this;
	}

	public RadioButtonPage clickImpressiveRadioButton() {
		selectRadioButton("Impressive");

		return this;
	}

	public String getMessage() {
		return message.getText();	
	}

	@Override
	protected String getRelativeUrl() {
		return "radio-button";
	}

	private void selectRadioButton(String label) {
		RadioButtonControlExtension control = getControlExtensionFactory().getRadioButtonGroup(radioGroupElement).get(label);	
		control.select(label);
	}
}
