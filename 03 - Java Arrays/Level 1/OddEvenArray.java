import java.util.Scanner;
public class OddEvenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Enter a natural number (greater than 0).");
            return;
        }
        int[] evens = new int[n / 2 + 1];
        int[] odds = new int[n / 2 + 1];
        int evenIndex = 0, oddIndex = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evens[evenIndex++] = i;
            } else {
                odds[oddIndex++] = i;
            }
        }
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odds[i] + " ");
        }
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evens[i] + " ");
        }
        input.close();
    }
}
