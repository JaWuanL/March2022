package demoQa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.HyperlinkControlExtension;
import framework.PageObjectBase;

public class HyperlinkPage extends PageObjectBase {

	@FindBy(id="linkResponse")
	private WebElement message;
	
	public HyperlinkPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	@Override
	protected String getRelativeUrl() {
		return "links";
	}

	public HyperlinkPage navigate() {
		super.navigateToRelativeUrl();
		
		return this;
	}

	public HyperlinkPage clickNoContentLink() {
		WebElement element = getDriver().findElement(By.linkText("No Content"));
		HyperlinkControlExtension control = new HyperlinkControlExtension(element);
		control.click();
		
		return this;
	}

	public String getMessage() {
		return message.getText();
	}
}
