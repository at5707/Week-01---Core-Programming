import java.util.*;
public class Largest{
	public static void main(String[] args){
		int number1,number2,number3;
		Scanner input = new Scanner(System.in);
		number1=input.nextInt();
		number2=input.nextInt();
		number3=input.nextInt();
		boolean isFirstLargest=(number1>number2)&&(number1>number3);
		boolean isSecondLargest=(number2>number1)&&(number2>number3);
		boolean isThirdLargest=(number3>number1)&&(number3>number2);
		System.out.println("Is the first number the largest? "+(isFirstLargest?"Yes":"No"));
		System.out.println("Is the second number the largest? "+(isSecondLargest?"Yes":"No"));
		System.out.println("Is the third number the largest? "+(isThirdLargest?"Yes":"No"));
	}
}