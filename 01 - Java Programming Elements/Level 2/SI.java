import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
		double P,R,T;
		Scanner input = new Scanner(System.in);
		P=input.nextDouble();
		R=input.nextDouble();
		T=input.nextDouble();
		double SI=((P*R*T)/100);
		System.out.println("The Simple Interest is "+SI+" for Principal "+P+", Rate of Interest "+R+" and Time "+T);
	}
}