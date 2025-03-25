import java.util.*;
public class factorwhile{
	public static void main(String[] args){
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		if(n<=0){
			System.out.println("The number "+n+" is not positive");
		}else{
			System.out.println("Factors of "+n+" are: ");
			int i=1;
			while(i<=n){
				if(n%i==0){
					System.out.println(i+" ");
				}
				i++;
			}
		}
	}
}