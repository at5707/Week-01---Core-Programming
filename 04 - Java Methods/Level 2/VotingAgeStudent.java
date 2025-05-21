import java.util.*;

public class VotingAgeStudent {
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < 10; i++) {
            boolean canVote = canStudentVote(studentAges[i]);
            System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") - " + (canVote ? "Can Vote" : "Cannot Vote"));
        }
	}
}