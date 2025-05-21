import java.util.*;
public class EuclideanDistance{
	public static void main(String[] args){
		double x1,y1,x2,y2;
		Scanner scanner = new Scanner(System.in);
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);
		double[] equation = findLineEquation(x1, y1, x2, y2);
        if (equation == null) {
            System.out.println("The points form a vertical line (undefined slope). Equation: x = " + x1);
        } else {
            System.out.printf("Equation of the line: y = %.2fx + %.2f%n", equation[0], equation[1]);
        }
	}
	 public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
	public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            return null;
		}
		double m = (y2 - y1) / (x2 - x1);
		double b = y1 - m * x1;
		return new double[]{m, b};
	}
}