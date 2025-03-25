import java.util.*;
public class BMI{
	public static void main(String[] args){
		double weight,heightcm;
		Scanner input = new Scanner(System.in);
		weight=input.nextDouble();
		heightcm=input.nextDouble();
		double heightm=heightcm/100;
		double bmi=weight/(heightm*heightm);
		String status;
		if(bmi<=18.4){
			status="Underweight";
		}else if(bmi>=18.5 && bmi<=24.9){
			status="Normal";
		}else if(bmi>=25.0 && bmi<=39.9){
			status="Overweight";
		}else{
			status="Obese";
		}
		System.out.println("BMI: "+bmi);
		System.out.println("Weight status: "+status);
	}
}