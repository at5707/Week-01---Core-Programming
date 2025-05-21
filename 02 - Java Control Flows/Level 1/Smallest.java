import java.util.*;
public class Smallest{
	public static void main(String[] args){
		int number1,number2,number3;
		Scanner input = new Scanner(System.in);
		number1=input.nextInt();
		number2=input.nextInt();
		number3=input.nextInt();
		boolean isSmallest=(number1<number2)&&(number1<number3);
		System.out.println("Is the first number the smallest? "+(isSmallest?"Yes":"No"));
	}
}