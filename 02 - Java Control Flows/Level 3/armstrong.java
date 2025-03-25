import java.util.*;
public class armstrong{
	public static void main(String[] args){
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		int original=n;
		int sum=0;
		while(original!=0){
			int digit=original%10;
			sum+=digit*digit*digit;
			original/=10;
		}
		if(sum==n){
			System.out.println(n+" is an Armstrong number");
		}else{
			System.out.println(n+" is not an Armstrong number");
		}
	}
}