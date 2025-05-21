import java.util.*;
public class MinimumMaximum{
	public static int[] findSmallestandLargest(int a,int b,int c){
		int smallest=Math.min(a,Math.min(b,c));
		int largest=Math.max(a,Math.max(b,c));
		return new int[]{smallest,largest};
	}
	public static void main(String[] args){
		int a,b,c;
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		int[] result=findSmallestandLargest(a,b,c);
		System.out.println("Smallest: "+result[0]);
		System.out.println("Largest: "+result[1]);
	}
}