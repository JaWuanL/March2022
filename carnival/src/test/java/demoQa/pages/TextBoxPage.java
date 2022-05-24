package demoQa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.PageObjectBase;

public class TextBoxPage extends PageObjectBase {

	@FindBy(id="userName")
	private WebElement userNameElement;
	
	@FindBy(id="currentAddress")
	private WebElement currentAddressElement;
	
	public TextBoxPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public TextBoxPage navigate() {
		super.navigateToRelativeUrl();

		return this;
	}
	
	public TextBoxPage enterFullName(String fullName) {
		getControlExtensionFactory().getTextbox(userNameElement).setValue(fullName);	
		
		return this;
	}

	public String getFullName() {
		return getControlExtensionFactory().getTextbox(userNameElement).getValue();	
	}

	public TextBoxPage enterCurrentAddress(String address) {
		getControlExtensionFactory().getTextbox(currentAddressElement).setValue(address);	

		return this;
	}

	public String getAddress() {
		return getControlExtensionFactory().getTextbox(currentAddressElement).getValue();		
	}

	@Override
	protected String getRelativeUrl() {
		return "textbox";
	}
}
