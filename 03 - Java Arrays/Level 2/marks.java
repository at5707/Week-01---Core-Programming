import java.util.*;
public class marks {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int[][] marks=new int[n][3];
		double[] percent=new double[n];
		char[] grade=new char[n];
		for(int i=0;i<n;i++){
			System.out.println("\nEnter details "+(i+1)+": ");
			for(int j=0;j<3;j++){
				String subject=(j==0)?"Physics":(j==1)?"Chemistry":"Maths";
				do{
					System.out.print(subject+" marks(0-100): ");
					marks[i][j]=input.nextInt();
					if(marks[i][j]<0||marks[i][j]>100){
						System.out.println("Invalid input");
					}
				}while(marks[i][j]<0||marks[i][j]>100);
			}
			int total=marks[i][0]+marks[i][1]+marks[i][2];
			percent[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3.0;
			if (percent[i] >= 80) {
				grade[i] = 'A';
			} else if (percent[i] >= 70) {
				grade[i] = 'B';
			} else if (percent[i] >= 60) {
				grade[i] = 'C';
			} else if (percent[i] >= 50) {
				grade[i] = 'D';
			} else if (percent[i] >= 40) {
				grade[i] = 'E';
			} else {
				grade[i] = 'R';
			}
		}
		System.out.println("\nStudent Grades: ");
		System.out.printf("%-10s %-10s %-10s %-10s %-12s %-10s\n","Physics","Chemistry","Maths","Total","percentage","grade");
		for(int i=0;i<n;i++){
			int total=marks[i][0]+marks[i][1]+marks[i][2];
			System.out.printf("%-10d %-10d %-10d %-10d %-12.2f %-10c\n",marks[i][0], marks[i][1], marks[i][2], total, percent[i], grade[i]);
		}
	}
}
