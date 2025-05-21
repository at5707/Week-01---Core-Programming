import java.util.*;
public class HarshadNumber{
	public static void main(String[] args){
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		int original=n;
		int sum=0;
		while(n>0){
			sum+=n%10;
			n/=10;
		}
		if(original%sum==0){
			System.out.println(original+" is a Harshad number");
		}else{
			System.out.println(original+" is not a Harshad number");
		}
	}
}