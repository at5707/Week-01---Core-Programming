import java.util.*;
public class NaturalNumber{
	public static void main(String[] args){
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		if(n>=1){
			int sum=(n*(n+1)/2);
			System.out.println("The sum of "+n+" natural numbers is "+sum);
		}else{
			System.out.println("The number "+n+" is not a natural number");
		}
	}
}