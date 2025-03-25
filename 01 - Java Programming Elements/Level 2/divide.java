import java.util.Scanner;
public class divide{
	public static void main(String[] args){
		int number1,number2;
		Scanner input=new Scanner(System.in);
		number1=input.nextInt();
		number2=input.nextInt(); 
		int quot=number1/number2;
		int rem=number1%number2;
		System.out.println("The Quotient is "+quot+" and Remainder is "+rem+" of two number "+number1+" and "+number2);
	}
}