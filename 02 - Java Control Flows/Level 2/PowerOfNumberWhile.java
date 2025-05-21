import java.util.*;
public class PowerOfNumberWhile{
	public static void main(String[] args){
		int n,p;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		p=input.nextInt();
		if(n<0||p<0){
			System.out.println("Base and power must be positive");
		}else{
			int result=1;
			int c=0;
			while(c<p){
				result*=n;
				c++;
			}
			System.out.println(n+" raised to power "+p+" is: "+result);
		}
	}
}