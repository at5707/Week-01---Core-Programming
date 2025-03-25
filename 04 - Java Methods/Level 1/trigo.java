import java.util.*;
public class trigo{
	public static double[] trigofunc(double angle){
		double radians=Math.toRadians(angle);
		double sine=Math.sin(radians);
		double cosine=Math.cos(radians);
		double tangent=Math.tan(radians);
		return new double[]{sine,cosine,tangent};
	}
	public static void main(String[] args){
		double angle;
		Scanner scanner=new Scanner(System.in);
		angle=scanner.nextDouble();
		double[] result=trigofunc(angle);
		System.out.println("Sine: "+result[0]);
		System.out.println("Cosine: "+result[1]);
		System.out.println("Tangent: "+result[2]);
	}
}