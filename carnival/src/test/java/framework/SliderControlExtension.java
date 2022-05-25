package framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.google.common.base.Stopwatch;

public class SliderControlExtension extends ControlExtensionBase {
	public SliderControlExtension(WebElement element) {
		super(element);
	}

	public void setValue(int value) {
		int min = getMin();
		int max = getMax();

		if(value < min || value > max) {
			throw new RuntimeException(value + " is out of bounds for the slider. Min: " + min + " Max: " + max);
		}

		getStatusElement().click();

		Duration timeout = Duration.ofSeconds(15);
		Stopwatch stopWatch = Stopwatch.createStarted();
		while(getValue() != value) {
			if(stopWatch.elapsed().compareTo(timeout) > 0)
			{
				throw new RuntimeException("Could not set slider value to " +value+ " within the timeout.");
			}
			if(getValue() < value) {
				getStatusElement().sendKeys(Keys.ARROW_RIGHT);
			}
			if(getValue() > value) {
				getStatusElement().sendKeys(Keys.ARROW_LEFT);
			}
		}
	}

	public int getMax() {
		String text = getStatusElement().getAttribute("max");

		return Integer.parseInt(text);
	}

	public int getMin() {
		String text = getStatusElement().getAttribute("min");

		return Integer.parseInt(text);
	}

	public int getValue() {
		String text = getStatusElement().getAttribute("value");

		return Integer.parseInt(text);
	}

	private WebElement getStatusElement() {
		return getWrappedElement().findElement(By.tagName("input"));
	}
}
