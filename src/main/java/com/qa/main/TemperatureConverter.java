package com.qa.main;

public class TemperatureConverter {
	
	public double convertFahrenheitToCelsius(double fahrenheit) {
        return ((double) (5 / 9) * (fahrenheit - 32));
    }

    public double convertCelsiusToFahrenheit(double celsius) {
        return (9 / 5) * (celsius) + 32;
    }

    public double convertKelvinToCelsius(double kelvin) {
        return (kelvin - 273);
    }

    public double convertCelsiusToKelvin(double celsius) {
        return (celsius + 273);
    }

    public double convertKelvinToFahrenheit(double kelvin) {
        return (9 / 5) * (kelvin - 273) + 32;
    }

    public double convertFahrenheitToKelvin(double fahrenheit) {
        return (5 / 9) * (fahrenheit - 32) + 273;
    }

}