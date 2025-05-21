import java.util.*;
public class QuadraticEquation{
	public static void main(String[] args){
		double a,b,c;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		double[] roots = findRoots(a, b, c);
		if (roots.length == 2) {
            System.out.println("Roots of the quadratic equation are: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The quadratic equation has one root: " + roots[0]);
        } else {
            System.out.println("The quadratic equation has no real roots.");
        }
	}
	public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[]{};
		}
	}
}