import java.util.*;
public class 5kmRunRounds{
	public static int calcround(double a,double b,double c){
		double peri=a+b+c;
		return (int) Math.ceil(5000/peri);
	}
	public static void main(String[] args){
		double a, b, c;
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextDouble();
		b=scanner.nextDouble();
		c=scanner.nextDouble();
		int rounds=calcround(a,b,c);
		System.out.println("The athlete needs to complete "+rounds+" rounds to finish 5km run");
	}
}