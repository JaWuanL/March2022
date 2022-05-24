package demoQa.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import demoQa.foundation.DemoQaTestBase;

public class SliderTests extends DemoQaTestBase {
	@Test
	public void canSetSliderValueMiddleValue() {
		int value = 80;

		setSliderValueThenAssert(value);
	}

	@Test
	public void canSetSliderValueLowValue() {
		int value = 17;

		setSliderValueThenAssert(value);
	}

	@Test
	public void canSetSliderValueMaxValue() {
		int value = 100;

		setSliderValueThenAssert(value);
	}

	@Test
	public void canSetSliderValueMinValue() {
		int value = 0;

		setSliderValueThenAssert(value);
	}

	private void setSliderValueThenAssert(int value) { 
		int actualValue = new SliderPage(getDriver(), getBaseUrl())
				.navigate()
				.setSliderValue(value)
				.getSliderValue();

		assertEquals(actualValue, value);
	}
}
