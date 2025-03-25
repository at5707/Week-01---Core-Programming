import java.util.*;
public class multitable{
	public static void main(String[] args){
		int[] table=new int[10];
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=0;i<10;i++){
			table[i]=n*(i+1);
		}
		System.out.println("\nMultiplication table of "+n+":");
		for(int i=0;i<10;i++){
			System.out.println(n+" * "+(i+1)+" = "+table[i]);
		}
	}
}