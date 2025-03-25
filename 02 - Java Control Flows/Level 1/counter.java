import java.util.*;
public class counter{
	public static void main(String[] args){
		int count;
		Scanner input = new Scanner(System.in);
		count=input.nextInt();
		for(int i=count;i>=1;i--){
			System.out.println(i);
		}
		System.out.println("Rocket launched!");
	}
}