import java.util.*;
public class IntegerCheck{
	public static int checknum(int n){
		if(n>0){
			return 1;
		} else if(n<0){
			return -1;
		}else{
			return 0;
		}
	}
	public static void main(String[] args){
		int n;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		int res=checknum(n);
		if(res==1){
			System.out.println("Positive");
		}else if(res==-1){
			System.out.println("Negative");
		}else{
			System.out.println("Zero");
		}
	}
}