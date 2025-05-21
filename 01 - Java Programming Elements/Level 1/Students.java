import java.util.Scanner;
public class HandshakesOfStudents{
	public static void main(String[] args){
		int n;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		int combination=(n*(n-1))/2;
		System.out.println("The number of handshakes are "+combination+" for "+n+" students");
	}
}
