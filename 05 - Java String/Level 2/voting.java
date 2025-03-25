import java.util.Random;
import java.util.Scanner;
public class voting{
	public static int[] generate(int n){
		Random random=new Random();
		int[] ages=new int[n];
		for(int i=0;i<n;i++){
			ages[i]=random.nextInt(90)+10;
		}
		return ages;
	}
	public static String[][] checkvotingeligible(int[] ages){
		String[][] result=new String[ages.length][2];
		for(int i=0;i<ages.length;i++){
			result[i][0]=String.valueOf(ages[i]);
			if(ages[i]<0){
				result[i][1]="Cannot vote";
			}else if(ages[i]>=18){
				result[i][1]="Can vote";
			}else{
				result[i][1]="Cannot vote";
			}
		}
		return result;
	}
	public static void display(String[][] data){
		System.out.println("\n---------------------------------");
        System.out.println("|  Age  | Voting Eligibility   |");
        System.out.println("---------------------------------");
        for (String[] row : data) {
            System.out.printf("|  %-4s | %-20s |\n", row[0], row[1]);
        }
        System.out.println("---------------------------------");
    }
	public static void main(String[] args){
		int n;
		Scanner scanner = new Scanner(System.in);
		n=scanner.nextInt();
		int[] studentAges=generate(n);
		String[][] votingData=checkvotingeligible(studentAges);
		display(votingData);
	}
}