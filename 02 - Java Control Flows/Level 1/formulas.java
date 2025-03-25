import java.util.*;
public class formulas{
	public static void main(String[] args){
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		if(n<=0){
			System.out.println("Number "+n+" is not a natural number");
		}else{
			int Sum=(n*(n+1)/2);
			int sum=0,i=1;
			while(i<=n){
				sum+=i;
				i++;
			}
			System.out.println("Sum with while: "+sum);
			System.out.println("Sum with formula: "+Sum);
			if(sum==Sum){
				System.out.println("Match.");
			}else{
				System.out.println("Not Match.");
			}
		}
	}
}
