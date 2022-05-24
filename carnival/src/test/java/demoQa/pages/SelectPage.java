package demoQa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObjectBase;

public class SelectPage extends PageObjectBase {

	@FindBy(how = How.ID, using="oldSelectMenu")
	WebElement element;

	public SelectPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	@Override
	protected String getRelativeUrl() {
		return "select-menu";
	}

	public SelectPage navigate() {
		super.navigateToRelativeUrl();
		return this;
	}

	public SelectPage setOldStyleValue(String value) {
		getControlExtensionFactory().getSelect(element).selectByVisibleText(value);

		return this;
	}

	public String getOldStyleValue() {
		WebElement selectedElement = getControlExtensionFactory().getSelect(element).getFirstSelectedOption();
			
		return selectedElement.getText();
	}

	public String[] getOldStyleOptions() {
		List<String> options = new ArrayList<String>();
		List<WebElement> optionElements = getControlExtensionFactory().getSelect(element).getOptions();
		
		for(WebElement optionElement:optionElements) {
			options.add(optionElement.getText());
		}
		
		return options.toArray(String[]::new);
	}
}
