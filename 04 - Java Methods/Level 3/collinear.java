import java.util.*;
public class collinear{
	public static void main(String[] args){
		double x1,y1,x2,y2,x3,y3;
		Scanner scanner = new Scanner(System.in);
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		x3 = scanner.nextDouble();
		y3 = scanner.nextDouble();
		boolean collinearSlope = checkCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Slope: " + collinearSlope);
		boolean collinearArea = checkCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Area: " + collinearArea);
	}
	public static boolean checkCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3){
		double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }
	public static boolean checkCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
}