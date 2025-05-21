import java.util.*;
public class CountingBack{
	public static void main(String[] args){
		int count;
		Scanner input = new Scanner(System.in);
		count=input.nextInt();
		while(count>=1){
			System.out.println(count);
			count--;
		}
		System.out.println("Rocket launched!");
	}
}