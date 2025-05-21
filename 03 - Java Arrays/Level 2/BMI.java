import java.util.*;
public class BMI {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		double[] heights=new double[n];
		double[] weights=new double[n];
		double[] bmiVals=new double[n];
		String[] weightStat=new String[n];
		for(int i=0;i<n;i++){
			System.out.println("\nEnter details "+(i+1)+": ");
			System.out.print("Enter height(meters): ");
			heights[i]=input.nextDouble();
			System.out.print("Enter weight(kg): ");
			weights[i]=input.nextDouble();
			bmiVals[i]=weights[i]/(heights[i]*heights[i]);
			if (bmiVals[i] <= 18.4) {
                weightStat[i] = "Underweight";
            } else if (bmiVals[i] <= 24.9) {
                weightStat[i] = "Normal";
            } else if (bmiVals[i] <= 39.9) {
                weightStat[i] = "Overweight";
            } else {
                weightStat[i] = "Obese";
            }
        }
		System.out.println("\nBMI: ");
		System.out.printf("%-10s %-10s %-10s %-10s\n","Height(m)","Weight(kg)","BMI","Status");
		for(int i=0;i<n;i++){
			System.out.printf("%-10.2f %-10.2f %-10.2f %-10s\n",heights[i],weights[i],bmiVals[i],weightStat[i]);
		}
	}
}