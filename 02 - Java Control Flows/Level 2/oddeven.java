import java.util.*;
public class oddeven{
	public static void main(String[] args){
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		if(n<=0){
			System.out.println("The number "+n+" is not natural");
		}else{
			System.out.println("Even and odd numbers between 1 and "+n+":");
			for(int i=1;i<=n;i++){
				if(i%2==0){
					System.out.println(i+" is an even number");
				}else{
					System.out.println(i+" is an odd number");
				}
			}
		}
	}
}