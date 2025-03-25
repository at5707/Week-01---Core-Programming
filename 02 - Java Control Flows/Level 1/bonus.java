import java.util.*;
public class bonus{
	public static void main(String[] args){
		double salary;
		int years;
		Scanner input = new Scanner(System.in);
		salary=input.nextDouble();
		years=input.nextInt();
		if(years>5){
			double bonus=salary*0.05;
			System.out.println("Eligible for bonus");
			System.out.println("Bonus: "+bonus);
		}else{
			System.out.println("Not eligible for bonus");
		}
	}
}