import java.util.*;
public class MultiplesBelow100While{
	public static void main(String[] args){
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		if(n<=0||n>=100){
			System.out.println("Enter valid number");
		}else{
			System.out.println("Multiples of "+n+" below 100 are: ");
			int c=99;
			while(c>1){
				if(c%n==0){
					System.out.println(c);
				}
				c--;
			}
		}
	}
}