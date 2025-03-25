import java.util.*;
public class digit{
	public static void main(String[] args){
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		if(n==0){
			System.out.println("Number of digits: 1");
		}else{
			int count=0;
			int original=Math.abs(n);
			while(original!=0){
				original/=10;
				count++;
			}
			System.out.println("Number of digits: "+count);
		}
	}
}