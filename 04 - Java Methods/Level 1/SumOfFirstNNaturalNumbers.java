import java.util.*;
public class SumOfFirstNNaturalNumbers{
		public static int sumnat(int n){
			int sum=0;
			for(int i=1;i<=n;i++){
				sum+=i;
			}
		return sum;
	}
	public static void main(String[] args){
		int n;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		int sum=sumnat(n);
		System.out.println("The sum of the first "+n+" natural number is: "+sum);
	}
}