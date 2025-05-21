import java.util.Scanner;
public class Heightincmandfeet{
	public static void main(String[] args){
		double height;
		Scanner input=new Scanner(System.in);
		height=input.nextDouble();
		double inch=height/2.54;
		double foot=(int)(inch/12);
		double inches=inch%12;
		System.out.println("Your height in cm is " + height + ", while in feet it is " + foot + " and inches is " + String.format("%.2f", inch));
	}
}