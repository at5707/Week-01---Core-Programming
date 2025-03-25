import java.util.Scanner;

public class Friend2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();
            
            System.out.print("Enter height (in cm) of " + friends[i] + ": ");
            heights[i] = scanner.nextDouble();
        }
        
        // Finding and displaying the youngest and tallest
        System.out.println("The youngest friend is: " + findYoungest(friends, ages));
        System.out.println("The tallest friend is: " + findTallest(friends, heights));

        scanner.close();
    }

    public static String findYoungest(String[] friends, int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return friends[minIndex];
    }

    public static String findTallest(String[] friends, double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return friends[maxIndex];
    }
}
