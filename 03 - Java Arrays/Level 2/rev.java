import java.util.*;
public class rev{
	public static void main(String[] args){
		int n;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		if(n==0){
			System.out.println("Reversed: 0");
			return;
		}
		int temp=n;
		int count=0;
		while(temp!=0){
			temp/=10;
			count++;
		}
		int[] digits=new int[count];
		temp=n;
		for(int i=0;i<count;i++){
			digits[i]=temp%10;
			temp/=10;
		}
		System.out.println("Reversed number: ");
		for(int i=0;i<count;i++){
			System.out.println(digits[i]);
		}
	}
}