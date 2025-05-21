import java.util.*;
public class SumWhileIf{
	public static void main(String[] args){
		double total=0.0;
		double number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number(0 or negative to stop)");
		while(true){
			number=input.nextDouble();
			if(number<=0){
				break;
			}
			total+=number;
			System.out.println("Enter number(0 to stop)");
		}
		System.out.println("Total: "+total);
	}
}		