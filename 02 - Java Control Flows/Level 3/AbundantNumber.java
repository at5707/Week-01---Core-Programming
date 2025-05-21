import java.util.*;
public class AbundantNumber{
	public static void main(String[] args){
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		int sum=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum+=i;
			}
		}
		if(sum>n){
			System.out.println(n+" is an abundant number");
		}else{
			System.out.println(n+" is not an abundant number");
		}
	}
}