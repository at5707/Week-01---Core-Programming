import java.util.*;
public class FactorOfN{
	public static void main(String[] args){
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		if(n<=0){
			System.out.println("The number "+n+" is not positive");
		}else{
			System.out.println("Factors of "+n+" are: ");
			for(int i=1;i<=n;i++){
				if(n%i==0){
					System.out.println(i+" ");
				}
			}
		}
	}
}