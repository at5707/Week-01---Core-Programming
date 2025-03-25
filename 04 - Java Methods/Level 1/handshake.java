import java.util.*;
public class handshake{
		public static int maxHand(int n){
			return (n*(n-1))/2;
		}
		public static void main(String[] args){
		int n;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		int handshakes=maxHand(n);
		System.out.println("Maximum handshakes in "+n+" students is "+handshakes);
	}
}		