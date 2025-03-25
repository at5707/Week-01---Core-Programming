import java.util.*;
public class integer{
	public static void main(String[] args){
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		if(n>0){
			System.out.println("The number is positive");
		}else if(n<0){
			System.out.println("The number is negative");
		}else{
			System.out.println("The number is zero");
		}
	}
}