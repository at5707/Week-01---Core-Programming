import java.util.*;
public class SimpleInterest{
	public static double calcSimpleInt(double principal,double rate,double time){
		return(principal*rate*time)/100;
	}
	public static void main(String[] args){
		double principal,rate,time;
		Scanner scanner=new Scanner(System.in);
		principal=scanner.nextDouble();
		rate=scanner.nextDouble();
		time=scanner.nextDouble();
		double si=calcSimpleInt(principal,rate,time);
		System.out.println("The simple interest is "+si+" for Principal "+principal+", rate of interest "+rate+" and time "+time);
	}
}