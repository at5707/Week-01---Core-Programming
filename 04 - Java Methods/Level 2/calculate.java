import java.util.*;
public class calculate{
	public static int[] findFact(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		int[] factors=new int[count];
		int index=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				factors[index++]=i;
			}
		}
		return factors;
	}
	public static int sum(int[] factors){
		int sum=0;
		for(int factor:factors){
			sum+=factor;
		}
		return sum;
	}
	public static int product(int[] factors){
		int product=1;
		for(int factor:factors){
			product*=factor;
		}
		return product;
	}
	public static int square(int[] factors){
		int sum=0;
		for(int factor:factors){
			sum+=Math.pow(factor,2);
		}
		return sum;
	}
	public static void main(String[] args){
		int n;
		Scanner scanner = new Scanner(System.in);
		n=scanner.nextInt();
		int[] factors=findFact(n);
		System.out.println("Factors: "+Arrays.toString(factors));
		System.out.println("Sum: "+sum(factors));
		System.out.println("Product: "+product(factors));
		System.out.println("Sum of squares: "+square(factors));
	}
}