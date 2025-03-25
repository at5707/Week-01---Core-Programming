import java.util.*;
public class bmicalculator{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double[][] data = new double[10][3];
		String[] statuses = new String[10];
		for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
			data[i][2] = calculateBMI(data[i][0], data[i][1]);
			statuses[i] = determineStatus(data[i][2]);
        }
		System.out.println("\nHeight (cm) | Weight (kg) | BMI | Status");
        System.out.println("----------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.1f cm     | %.1f kg     | %.2f | %s\n",
                              data[i][1], data[i][0], data[i][2], statuses[i]);
        }
	}
	public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }
	public static String determineStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}