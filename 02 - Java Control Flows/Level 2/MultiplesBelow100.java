import java.util.*;
public class MultiplesBelow100{
	public static void main(String[] args){
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		if(n<=0||n>=100){
			System.out.println("Enter valid number");
		}else{
			System.out.println("Multiples of "+n+" below 100 are: ");
			for(int i=99;i>=1;i--){
				if(i%n==0){
					System.out.println(i+" ");
				}
			}
		}
	}
}