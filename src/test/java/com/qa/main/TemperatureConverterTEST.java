package com.qa.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TemperatureConverterTEST {

	private TemperatureConverter temp;

	@Test
	public void convertFahrenheitToCelsiusTest() {
		temp = new TemperatureConverter();

		double result = temp.convertFahrenheitToCelsius(5);
		
		assertTrue(temp instanceof TemperatureConverter);
		assertEquals(((5 / 9) * (5 - 32)), result);
	}

	@Test
	public void convertCelsiusToFahrenheitTest() {
		temp = new TemperatureConverter();

		double result = temp.convertCelsiusToFahrenheit(10);

		assertEquals(((9 / 5) * (10) + 32), result);

	}

	@Test
	public void convertKelvinToCelsiusTest() {
		temp = new TemperatureConverter();

		double result = temp.convertKelvinToCelsius(500);

		assertEquals(((500 - 273)), result);
	}

	@Test
	public void convertCelsiusToKelvinTest() {
		temp = new TemperatureConverter();

		double result = temp.convertCelsiusToKelvin(1);

		assertEquals(((1 + 273)), result);
	}

	@Test
	public void convertKelvinToFahrenheitTest() {
		temp = new TemperatureConverter();

		double result = temp.convertKelvinToFahrenheit(1000);

		assertEquals(((9 / 5) * (1000 - 273) + 32), result);
	}

	@Test
	public void convertFahrenheitToKelvinTest() {
		temp = new TemperatureConverter();

		double result = temp.convertFahrenheitToKelvin(523);

		assertEquals(((5 / 9) * (523 - 32) + 273), result);
	}

	
}
