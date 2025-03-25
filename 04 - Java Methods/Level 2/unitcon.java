import java.util.*;
public class unitcon{
	private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;
    private static final double POUNDS_TO_KILOGRAMS = 0.453592;
    private static final double KILOGRAMS_TO_POUNDS = 2.20462;
    private static final double GALLONS_TO_LITERS = 3.78541;
    private static final double LITERS_TO_GALLONS = 0.264172;

    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }

    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * POUNDS_TO_KILOGRAMS;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * KILOGRAMS_TO_POUNDS;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * GALLONS_TO_LITERS;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * LITERS_TO_GALLONS;
    }
	public static void main(String[] args){
		double value;
		Scanner scanner = new Scanner(System.in);
		value = scanner.nextDouble();
		System.out.println(value + " km = " + convertKmToMiles(value) + " miles");
        System.out.println(value + " miles = " + convertMilesToKm(value) + " km");
        System.out.println(value + " meters = " + convertMetersToFeet(value) + " feet");
        System.out.println(value + " feet = " + convertFeetToMeters(value) + " meters");
        System.out.println(value + " Fahrenheit = " + convertFahrenheitToCelsius(value) + " Celsius");
        System.out.println(value + " Celsius = " + convertCelsiusToFahrenheit(value) + " Fahrenheit");
        System.out.println(value + " pounds = " + convertPoundsToKilograms(value) + " kilograms");
        System.out.println(value + " kilograms = " + convertKilogramsToPounds(value) + " pounds");
        System.out.println(value + " gallons = " + convertGallonsToLiters(value) + " liters");
        System.out.println(value + " liters = " + convertLitersToGallons(value) + " gallons");
	}
}