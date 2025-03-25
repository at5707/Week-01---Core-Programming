import java.util.*;
public class grade{
	public static void main(String[] args){
		int physics,chemistry,maths;
		Scanner input = new Scanner(System.in);
		physics=input.nextInt();
		chemistry=input.nextInt();
		maths=input.nextInt();
		int total=physics+chemistry+maths;
		double percent=total/3.0;
		String grade,remarks;
		if(percent>=80){
			grade="A";
			remarks="Level 4, above agency-normalized standards";
		}else if(percent>=70){
			grade="B";
			remarks="Level 3, above agency-normalized standards";
		}else if(percent>=60){
			grade="C";
			remarks="Level 2, below, but approaching agency-normalized standards";
		}else if(percent>=50){
			grade="D";
			remarks="Level 1, well below agency-normalized standards";
		}else if(percent>=40){
			grade="E";
			remarks="Level 1-, too below agency-normalized standards";
		}else{
			grade="R";
			remarks="Remedial standards";
		}
		System.out.println("Total marks: "+total);
		System.out.println("Percentage: "+percent);
		System.out.println("Grade: "+grade);
		System.out.println("Remarks: "+remarks);
	}
}
		