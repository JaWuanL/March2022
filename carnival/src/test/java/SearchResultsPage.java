import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.PageObjectBase;

public class SearchResultsPage extends PageObjectBase {
	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}

	public String getHeaderText() {
		WebElement headerTextElement = this.getDriver().findElement(By.cssSelector("H1 span.lighter"));
		String headerText = headerTextElement.getText();
		String headerTextCleaned = headerText.replace("\"", "").toLowerCase();	
		
		return headerTextCleaned;	
	}
}
