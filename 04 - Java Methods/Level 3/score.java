import java.util.Random;
import java.util.Scanner;
public class score{
	public static int[][] generate(int num){
		Random rand=new Random();
		int[][] score=new int[num][3];
		for(int i=0;i<num;i++){
			score[i][0]=rand.nextInt(41)+60;
			score[i][1]=rand.nextInt(41)+60;
			score[i][2]=rand.nextInt(41)+60;
		}
		return score;
	}
	public static double[][] calculateResults(int[][] score) {
        int num = score.length;
        double[][] results = new double[num][3];
		for (int i = 0; i < num; i++) {
            int total = score[i][0] + score[i][1] + score[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
	public static void displayScorecard(int[][] score, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < score.length; i++) {
            System.out.println((i + 1) + "\t" + score[i][0] + "\t" + score[i][1] + "\t\t" + score[i][2] + "\t"
                    + (int) results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "%");
        }
    }
	public static void main(String[] args){
		int num;
		Scanner scanner = new Scanner(System.in);
		num=scanner.nextInt();
		int[][] score=generate(num);
		double[][] results=calculateResults(score);
		displayScorecard(score,results);
	}
}