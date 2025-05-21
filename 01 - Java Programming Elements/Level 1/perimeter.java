import java.util.Scanner;
public class Perimeter{
	public static void main(String[] args){
		int side;
		Scanner input=new Scanner(System.in);
		side=input.nextInt();
		int perimeter=4*side;
		System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
	}
}
