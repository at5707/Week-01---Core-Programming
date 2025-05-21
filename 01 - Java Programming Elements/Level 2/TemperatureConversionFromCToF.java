import java.util.Scanner;
public class TemperatureConversionFromCToF{
	public static void main(String[] args){
		double c;
		Scanner input=new Scanner(System.in);
		c=input.nextDouble(); 
		double f=(c*(9.0/5.0))+32;
		System.out.println("The "+c+" celsius is "+f+" farenheit");
	}
}