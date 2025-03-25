import java.util.*;
public class factorialf{
	public static void main(String[] args){
		int n;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		if(n<0){
			System.out.println("Not defined");
		}else{
			long factorial=1;
			for(int i=1;i<=n;i++){
				factorial*=i;
			}
			System.out.println("Factorial of "+n+" is: "+factorial);
		}
	}
}
