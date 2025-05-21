import java.util.*;
public class DivisionForRemainderAndQuotient{
	public static int[] findRemainderAndQuotient(int n,int d){
		int quotient=n/d;
		int remainder=n%d;
		return new int[]{quotient,remainder};
	}
	public static void main(String[] args){
		int n,d;
		Scanner scanner = new Scanner(System.in);
		n=scanner.nextInt();
		d=scanner.nextInt();
		if(d==0){
			System.out.println("Division by zero is not allowed");
		} else {
			int[] result = findRemainderAndQuotient(n, d);
			System.out.println("Quotient: " + result[0]);
			System.out.println("Remainder: " + result[1]);
		}
	}
}