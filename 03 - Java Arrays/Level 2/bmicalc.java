import java.util.*;
public class bmicalc {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		double[][] personData=new double[n][3];
		String[] weightStat=new String[n];
		for(int i=0;i<n;i++){
			System.out.println("\nEnter details "+(i+1)+": ");
			do{
				System.out.print("Enter height(meters): ");
				personData[i][0]=input.nextDouble();
				if(personData[i][0]<=0){
					System.out.println("Enter positive height.");
				}
			}while(personData[i][0]<=0);
			do{
				System.out.print("Enter weight(kg): ");
				personData[i][1]=input.nextDouble();
				if(personData[i][1]<=0){
					System.out.println("Enter positive weight.");
				}
			}while(personData[i][1]<=0);
			personData[i][2]=personData[i][1]/(personData[i][0]*personData[i][0]);
			if (personData[i][2] <= 18.4) {
				weightStat[i] = "Underweight";
			} else if (personData[i][2] <= 24.9) {
				weightStat[i] = "Normal";
			} else if (personData[i][2] <= 39.9) {
				weightStat[i] = "Overweight";
			} else {
				weightStat[i] = "Obese";
			}
		}
		System.out.println("\nBMI: ");
		System.out.printf("%-10s %-10s %-10s %-10s\n","Height(m)","Weight(kg)","BMI","Status");
		for(int i=0;i<n;i++){
			System.out.printf("%-10.2f %-10.2f %-10.2f %-10s\n",personData[i][0],personData[i][1],personData[i][2],weightStat[i]);
		}
	}
}