import java.util.*;
public class natural2{
	public static int sum(int n){
		if(n==1) return 1;
		return n+sum(n-1);
	}
	public static int sumfor(int n){
		return n*(n+1)/2;
	}
	public static void main(String[] args){
		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		if(n<=0){
			System.out.println("Enter valid number");
		}else{
			int sumrec=sum(n);
			int sumform=sumfor(n);
			System.out.println("Sum for recursion: "+sumrec);
			System.out.println("Sum for formula: "+sumform);
			if(sumrec==sumform){
				System.out.println("Matching computations.");
			}else{
				System.out.println("Mismatching computations.");
			}
		}
	}
}