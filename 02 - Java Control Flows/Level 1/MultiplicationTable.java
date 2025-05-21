import java.util.*;
public class MultiplicationTable{
	public static void main(String[] args){
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		System.out.println("Multiplication table of "+n+" from 6 to 9:");
		for(int i=6;i<=9;i++){
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}
}
