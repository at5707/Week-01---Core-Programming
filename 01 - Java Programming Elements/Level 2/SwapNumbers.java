import java.util.Scanner;
public class SwapNumbers{
	public static void main(String[] args){
		int number1,number2;
		Scanner input=new Scanner(System.in);
		number1=input.nextInt();
		number2=input.nextInt();
		int temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("The swapped numbers are "+number1+" and "+number2);
	}
}