import java.util.*;
public class unit{
	private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;
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
	public static void main(String[] args){
		double value;
		Scanner scanner = new Scanner(System.in);
		value=scanner.nextDouble();
		System.out.println(value + " km = " + convertKmToMiles(value) + " miles");
        System.out.println(value + " miles = " + convertMilesToKm(value) + " km");
        System.out.println(value + " meters = " + convertMetersToFeet(value) + " feet");
        System.out.println(value + " feet = " + convertFeetToMeters(value) + " meters");
	}
}