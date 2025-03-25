import java.util.*;
public class rpsgame{
	public static String getComp(){
		String[] choices={"Rock","Paper","Scissors"};
		int random=(int)(Math.random()*3);
		return choices[random];
	}
	public static String find(String userChoice,String computerChoice){
		if(userChoice.equals(computerChoice)){
			return "Tie";
		}else if((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                   (userChoice.equals("Scissors") && computerChoice.equals("Paper")) ||
                   (userChoice.equals("Paper") && computerChoice.equals("Rock"))) {
            return "User Wins";
        }else{
            return "Computer Wins";
        }
    }
	public static String[][] calculateStats(int userWins,int computerWins,int totalGames){
		String[][] stats=new String[2][2];
		double userWinPercent = (userWins / (double) totalGames) * 100;
        double computerWinPercent = (computerWins / (double) totalGames) * 100;

        stats[0][0] = "User Win %";
        stats[0][1] = String.format("%.2f", userWinPercent) + "%";

        stats[1][0] = "Computer Win %";
        stats[1][1] = String.format("%.2f", computerWinPercent) + "%";

        return stats;
    }
	public static void display(String[][] results,String[][] stats){
		System.out.println("\n-------------------------------------------------");
        System.out.println("|  Round  |  User Choice  |  Computer Choice  |  Result  |");
        System.out.println("-------------------------------------------------");
        
        for (String[] row : results) {
            System.out.printf("|   %-5s |  %-12s |  %-15s |  %-10s |\n", row[0], row[1], row[2], row[3]);
        }
        
        System.out.println("-------------------------------------------------\n");
        System.out.println("Overall Win Statistics:");
        System.out.println("----------------------------------");
        for (String[] row : stats) {
            System.out.printf("| %-15s | %-10s |\n", row[0], row[1]);
        }
        System.out.println("----------------------------------");
    }
	public static void main(String[] args){
		int rounds;
		Scanner scanner = new Scanner(System.in);
		rounds = scanner.nextInt();
        scanner.nextLine();
		int userWins=0,computerWins=0,ties=0;
		String[][] results=new String[rounds][4];
		for(int i=0;i<rounds;i++){
			System.out.print("\nEnter Rock,Paper or Scissors: ");
			String userChoice=scanner.nextLine().trim();
			while (!userChoice.equalsIgnoreCase("Rock") && 
                   !userChoice.equalsIgnoreCase("Paper") && 
                   !userChoice.equalsIgnoreCase("Scissors")) {
                System.out.print("Invalid choice! Enter Rock, Paper, or Scissors: ");
                userChoice = scanner.nextLine().trim();
            }
			userChoice = userChoice.substring(0, 1).toUpperCase() + userChoice.substring(1).toLowerCase();
            
            String computerChoice = getComp();
            String result = find(userChoice, computerChoice);

            if (result.equals("User Wins")) {
                userWins++;
            } else if (result.equals("Computer Wins")) {
                computerWins++;
            } else {
                ties++;
            }
			results[i][0] = String.valueOf(i + 1);
            results[i][1] = userChoice;
            results[i][2] = computerChoice;
            results[i][3] = result;
        }
		String[][] stats = calculateStats(userWins, computerWins, rounds);
		display(results, stats);
	}
}
