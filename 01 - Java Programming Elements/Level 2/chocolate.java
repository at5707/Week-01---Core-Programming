import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
		int N,M;
		Scanner input = new Scanner(System.in);
		N=input.nextInt();
		M=input.nextInt();
		int numchoco=N/M;
		int numremain=N%M;
		System.out.println("The number of chocolates each child gets is "+numchoco+" and the number of remaining chocolates are "+numremain);
	}
}
