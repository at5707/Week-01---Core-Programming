import java.util.*;
public class Divisible{
	public static void main(String[] args){
		int number;
		Scanner input = new Scanner(System.in);
		number=input.nextInt();
		if(number%5==0){
			System.out.println("Is the number "+number+" divisible by 5? Yes");
		}else{
			System.out.println("Is the number "+number+" divisible by 5? No");
		}
	}
}