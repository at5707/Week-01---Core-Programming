import java.util.*;
public class BMICheck{
	public static String[][] computeBMI(double[][] data){
		String[][] results=new String[data.length][4];
		for(int i=0;i<data.length;i++){
			double heightm=data[i][1]/100;
			double bmi=data[i][0]/(heightm*heightm);
			bmi=Math.round(bmi*100.0)/100.0;
			String status;
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";
			results[i][0]=String.format("%.2f",data[i][0]);
			results[i][1]=String.format("%.2f",data[i][1]);
			results[i][2]=String.format("%.2f",bmi);
			results[i][3]=status;
		}
		return results;
	}
	public static void display(String[][] results){
		System.out.println("\n----------------------------------------------------");
        System.out.println("| Person | Weight (kg) | Height (cm) | BMI  | Status      |");
        System.out.println("----------------------------------------------------");
		for(int i=0;i<results.length;i++){
			System.out.printf("|   %-5d |    %-9s |   %-9s | %-5s | %-11s |\n",(i + 1), results[i][0], results[i][1], results[i][2], results[i][3]);
        }
		System.out.println("---------------------------------------------------");
	}
	public static void main(String[] args){
		int num;
		Scanner scanner = new Scanner(System.in);
		num=scanner.nextInt();
		double[][] data=new double[num][2];
		for(int i=0;i<num;i++){
			System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
		}
		String[][] results=computeBMI(data);
		display(results);
	}
}