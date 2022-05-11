import org.openqa.selenium.WebElement;

public class ProductTile {
	private WebElement wrappedElement;

	public ProductTile(WebElement element) {
		this.wrappedElement = element;
	}

	protected WebElement getWrappedElement() {
		return wrappedElement;
	}	
}
