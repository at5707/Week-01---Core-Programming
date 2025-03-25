import java.util.Scanner;
public class Income{
	public static void main(String[] args){
		int salary,bonus;
		Scanner input=new Scanner(System.in);
		salary=input.nextInt();
		bonus=input.nextInt();
		int income=salary+bonus;
		System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence total income is INR "+income);
	}
}