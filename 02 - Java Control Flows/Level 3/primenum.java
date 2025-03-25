import java.util.*;
public class primenum{
	public static void main(String[] args){
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		boolean isPrime=true;
		if(n<=1){
			isPrime=true;
		}else{
			for(int i=2;i<n;i++){
				if(n%i==0){
					isPrime=false;
					break;
				}
			}
		}
		if(isPrime){
			System.out.println(n+" is a Prime number");
		}else{
			System.out.println(n+" is not a Prime number");
		}
	}
}