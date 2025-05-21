import java.util.*;
public class SumWhile{
	public static void main(String[] args){
		double total=0.0;
		double number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number(0 to stop)");
		number=input.nextDouble();
		while(number!=0){
			total+=number;
			System.out.println("Enter number(0 to stop)");
			number=input.nextDouble();
		}
		System.out.println("Total: "+total);
	}
}
