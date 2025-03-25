import java.util.Scanner;
public class TempConversion{
	public static void main(String[] args){
		double f;
		Scanner input=new Scanner(System.in);
		f=input.nextDouble(); 
		double c=(f-32)*(5.0/9.0);
		System.out.println("The "+f+" farenheit is "+c+" celsius");
	}
}