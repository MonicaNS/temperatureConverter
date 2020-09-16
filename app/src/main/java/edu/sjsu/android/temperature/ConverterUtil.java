package edu.sjsu.android.temperature;

public class ConverterUtil {

    public static float converFahrenheitToCelsius(float fahrenheit){
        return ((fahrenheit - 32) * 5/9);
    }

    public static float convertCelsiusToFahrenheit(float celsius){
        return ((celsius * 9)/5) + 32;
    }
}
