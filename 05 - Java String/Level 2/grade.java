import java.util.Random;
public class grade{
	public static int[][] generate(int num){
		Random rand=new Random();
		int[][] scores=new int[num][3];
		for(int i=0;i<num;i++){
			scores[i][0] = rand.nextInt(61) + 40;
			scores[i][1] = rand.nextInt(61) + 40;
			scores[i][2] = rand.nextInt(61) + 40;
		}
		return scores;
	}
	public static double[][] calculate(int[][] scores){
		int num=scores.length;
		double[][] stats=new double[num][3];
		for(int i=0;i<num;i++){
			int total=scores[i][0]+scores[i][1]+scores[i][2];
			double average=total/3.0;
			double percent=Math.round((total/300.0)*10000)/100.0;
			stats[i][0]=total;
			stats[i][1]=Math.round(average*100)/100.0;
			stats[i][2]=percent;
		}
		return stats;
	}
	public static String[] assignGrades(double[][] stats){
		String[] grade=new String[stats.length];
		for(int i=0;i<stats.length;i++){
			double percent=stats[i][2];
			if(percent>=80) grade[i]="A";
			else if(percent>=70) grade[i]="B";
			else if (percent >= 60) grade[i] = "C";
            else if (percent >= 50) grade[i] = "D";
            else if (percent >= 40) grade[i] = "E";
            else grade[i] = "R";
		}
		return grade;
	}
	public static void display(int[][] scores,double[][] stats,String[] grade){
		System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.println("| Student | Physics | Chemistry | Maths | Total | Average | Percentage | Grade |");
        System.out.println("-------------------------------------------------------------------------------------");
		for(int i=0;i<scores.length;i++){
			System.out.printf("|   %-6d |   %-6d |   %-8d |  %-5d |  %-5.0f |  %-7.2f |  %-9.2f |   %-3s  |\n",(i+1),scores[i][0],scores[i][1],scores[i][2],stats[i][0],stats[i][1],stats[i][2],grade[i]);
		}
		System.out.println("-------------------------------------------------------------------------------------\n");
    }
	public static void main(String[] args){
		int num=10;
		int[][] scores=generate(num);
		double[][] stats=calculate(scores);
		String[] grade=assignGrades(stats);
		display(scores,stats,grade);
	}
}
		