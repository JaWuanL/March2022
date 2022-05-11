package demoQa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.PageObjectBase;

public class TextBoxPage extends PageObjectBase {
	private static final String URL = "https://demoqa.com/text-box";

	@FindBy(id="userName")
	private WebElement userNameElement;
	
	@FindBy(id="currentAddress")
	private WebElement currentAddressElement;
	
	public TextBoxPage(WebDriver driver) {
		super(driver);
	}

	public TextBoxPage navigate() {
		this.getDriver().navigate().to(URL);

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
}
