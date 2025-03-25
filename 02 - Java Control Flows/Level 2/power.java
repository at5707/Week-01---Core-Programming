import java.util.*;
public class power{
	public static void main(String[] args){
		int n,p;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		p=input.nextInt();
		if(n<0||p<0){
			System.out.println("Base and power must be positive");
		}else{
			int result=1;
			for(int i=1;i<=p;i++){
				result*=n;
			}
			System.out.println(n+" raised to power "+p+" is: "+result);
		}
	}
}