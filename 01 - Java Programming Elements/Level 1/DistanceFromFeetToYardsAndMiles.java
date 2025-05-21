import java.util.Scanner;
public class DistanceFromFeetToYardsAndMiles{
	public static void main(String[] args){
		double feet;
		Scanner input=new Scanner(System.in);
		feet=input.nextDouble();
		double yards=feet/3.0;
		double miles=feet/5280.0;
		System.out.println(feet+" feet is equal to "+yards+" yards and "+miles+" miles");
	}
}
