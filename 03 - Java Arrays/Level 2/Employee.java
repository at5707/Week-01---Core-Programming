import java.util.*;
public class Employee {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int NUM_EMPLOYEES=10;
		double[] salaries=new double[NUM_EMPLOYEES];
		double[] years=new double[NUM_EMPLOYEES];
		double[] bonus=new double[NUM_EMPLOYEES];
		double[] newSalary=new double[NUM_EMPLOYEES];
		double totalBonus=0.0,totalOldSalary=0.0,totalNewSalary=0.0;
		for(int i=0;i<NUM_EMPLOYEES;i++){
			while(true){
				System.out.println("Enter salary for employee "+(i+1)+": ");
				double salary=input.nextDouble();
				System.out.println("Enter years of service for employee "+(i+1)+": ");
				double year=input.nextDouble();
				if(salary<=0||year<0){
					System.out.println("Invalid input");
				}else{
					salaries[i]=salary;
					years[i]=year;
					break;
				}
			}
		}
		for(int i=0;i<NUM_EMPLOYEES;i++){
			double bonusPercent=(years[i]>5)?0.05:0.02;
			bonus[i]=salaries[i]*bonusPercent;
			newSalary[i]=salaries[i]+bonus[i];
			totalBonus+=bonus[i];
			totalOldSalary+=salaries[i];
			totalNewSalary+=newSalary[i];
		}
		System.out.println("\nEmployee bonus: ");
		System.out.printf("%-5s %-10s %-10s %-10s %-10s\n","No","Salary","Years","Bonus","New Salary");
		for(int i=0;i<NUM_EMPLOYEES;i++){
			System.out.printf("%-5d %-10.2f %-10.2f %-10.2f %-10.2f\n",(i+1),salaries[i],years[i],bonus[i],newSalary[i]);
		}
		System.out.println("\nTotal Bonus: "+totalBonus);
		System.out.println("Total old: "+totalOldSalary);
		System.out.println("Total new: "+totalNewSalary);
	}
}
	