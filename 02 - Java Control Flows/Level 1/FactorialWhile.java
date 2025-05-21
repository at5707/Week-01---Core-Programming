import java.util.*;
public class FactorialWhile{
	public static void main(String[] args){
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		if(n<0){
			System.out.println("Not defined");
		}else{
			long factorial=1;
			int i=n;
			while(i>0){
				factorial*=i;
				i--;
			}
			System.out.println("Factorial of "+n+" is: "+factorial);
		}
	}
}
