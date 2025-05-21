import java.util.*;
public class DoubleMarksAndGrades {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		double[][] studentData=new double[n][4];
		char[] grade=new char[n];
		for(int i=0;i<n;i++){
			System.out.println("\nEnter details "+(i+1)+": ");
			for(int j=0;j<3;j++){
				String subject=(j==0)?"Physics":(j==1)?"Chemistry":"Maths";
				do{
					System.out.print(subject+" marks(0-100): ");
					studentData[i][j]=input.nextDouble();
					if(studentData[i][j]<0||studentData[i][j]>100){
						System.out.println("Invalid input");
					}
				}while(studentData[i][j]<0||studentData[i][j]>100);
			}
			double total=studentData[i][0]+studentData[i][1]+studentData[i][2];
			studentData[i][3]=total/3.0;
			if (studentData[i][3] >= 80) {
				grade[i] = 'A';
			} else if (studentData[i][3] >= 70) {
				grade[i] = 'B';
			} else if (studentData[i][3] >= 60) {
				grade[i] = 'C';
			} else if (studentData[i][3] >= 50) {
				grade[i] = 'D';
			} else if (studentData[i][3] >= 40) {
				grade[i] = 'E';
			} else {
				grade[i] = 'R';
			}
		}
		System.out.println("\nStudent Grades: ");
		System.out.printf("%-10s %-10s %-10s %-12s %-10s\n","Physics","Chemistry","Maths","percentage","grade");
		for(int i=0;i<n;i++){
			System.out.printf("%-10.2f %-10.2f %-10.2f %-12.2f %-10c\n",studentData[i][0], studentData[i][1], studentData[i][2], studentData[i][3], grade[i]);
		}
	}
}